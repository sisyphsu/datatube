package com.github.sisyphsu.nakedata.convertor;

import com.github.sisyphsu.nakedata.convertor.codec.Codec;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * CodecFactory, meantains CodecMethod and Pipeline.
 *
 * @author sulin
 * @since 2019-05-20 16:14:54
 */
public class CodecFactory {

    public static final CodecFactory Instance = new CodecFactory(null);

    private Set<Codec> codecs = new HashSet<>();
    private CodecMap methodTree = new CodecMap();
    private Map<ConvertPipeline, ConvertPipeline> pipelineMap = new ConcurrentHashMap<>();

    /**
     * Initialize CodecFactory with the specified Codec type.
     *
     * @param codecs Codec type
     */
    public CodecFactory(Set<Codec> codecs) {
        for (Class<? extends Codec> codecCls : CodecScanner.scanAllCodecs()) {
            this.installCodec(codecCls);
        }
        if (codecs != null) {
            this.installCodec(codecs); // init index
        }
    }

    /**
     * Install new codec
     *
     * @param codecClass new codec's class
     */
    public void installCodec(Class<? extends Codec> codecClass) {
        Codec codec;
        try {
            codec = codecClass.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid codec's class, newInstance failed.", e);
        }
        this.installCodec(codec);
    }

    /**
     * Install new codec
     *
     * @param codec new codec
     */
    public void installCodec(Codec codec) {
        this.installCodec(Collections.singleton(codec));
    }

    /**
     * install new codec into this CodecFactory
     *
     * @param codecs new codec
     */
    public void installCodec(Set<Codec> codecs) {
        if (codecs == null) {
            return;
        }
        for (Codec codec : codecs) {
            if (codec == null || !this.codecs.add(codec)) {
                continue;
            }
            // collect all encode and decode methods
            for (Method method : codec.getClass().getDeclaredMethods()) {
                ConvertMethod convertMethod = ConvertMethod.valueOf(codec, method);
                if (convertMethod == null) {
                    continue;
                }
                methodTree.put(convertMethod);
            }
            codec.setFactory(this);
        }
        // reset all pipeline
        this.pipelineMap.clear();
    }

    /**
     * Do data convert. convert src into tgtClass instance.
     *
     * @param src      Source data
     * @param tgtClass Target class
     * @param <S>      GenericType
     * @param <T>      GenericType
     * @return Target instance
     */
    @SuppressWarnings("unchecked")
    public <S, T> T doConvert(S src, Class<T> tgtClass) {
        ConvertPipeline key = ConvertPipeline.valueOf(src.getClass(), tgtClass);
        ConvertPipeline pipeline = pipelineMap.computeIfAbsent(key, (k) -> {
            List<ConvertMethod> methods = this.dfs(key.getSrcClass(), key.getTgtClass(), methodTree);
            if (methods == null || methods.size() == 0) {
                return null;
            }
            return ConvertPipeline.valueOf(methods);
        });
        if (pipeline == null) {
            throw new IllegalStateException("Can't convert " + src.getClass() + " to " + tgtClass);
        }
        return (T) pipeline.convert(src, tgtClass);
    }

    /**
     * Search the shortest codec path
     */
    private List<ConvertMethod> dfs(Class src, Class tgt, CodecMap map) {
        ConvertMethod direct = map.get(src, tgt);
        if (direct != null) {
            return Collections.singletonList(direct); // directly
        }
        Collection<ConvertMethod> ts = map.get(src);
        if (ts == null || ts.isEmpty()) {
            return null; // noway
        }
        // find shortest way
        ConvertMethod router = null;
        List<ConvertMethod> subResult = null;
        for (ConvertMethod t : ts) {
            List<ConvertMethod> tmp = this.dfs(t.getTgtClass(), tgt, map);
            if (tmp == null || tmp.isEmpty()) {
                continue;
            }
            if (subResult == null || subResult.size() > tmp.size()) {
                subResult = tmp;
                router = t;
            }
        }
        if (subResult == null) {
            return null; // noway
        }
        List<ConvertMethod> result = new ArrayList<>();
        result.add(router);
        result.addAll(subResult);
        return result;
    }

    /**
     * CodecMap, like MultiKeyMap, meantains codec tree.
     */
    public static class CodecMap {

        private Map<Class, Map<Class, ConvertMethod>> map = new ConcurrentHashMap<>();

        public void put(ConvertMethod method) {
            map.computeIfAbsent(method.getSrcClass(), (c) -> new ConcurrentHashMap<>()).put(method.getTgtClass(), method);
        }

        public Collection<ConvertMethod> get(Class srcClass) {
            Map<Class, ConvertMethod> tgtMap = map.get(srcClass);
            if (tgtMap == null) {
                return null;
            }
            return tgtMap.values();
        }

        public ConvertMethod get(Class srcClass, Class tgtClass) {
            Map<Class, ConvertMethod> tgtMap = map.get(srcClass);
            if (tgtMap == null) {
                return null;
            }
            return tgtMap.get(tgtClass);
        }

    }

}