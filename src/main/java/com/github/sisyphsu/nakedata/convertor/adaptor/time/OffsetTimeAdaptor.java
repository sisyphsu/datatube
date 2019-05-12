package com.github.sisyphsu.nakedata.convertor.adaptor.time;

import com.github.sisyphsu.nakedata.convertor.adaptor.Adaptor;

import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;

/**
 * {@link OffsetTime}与{@link String}的数据转换适配器
 *
 * @author sulin
 * @since 2019-05-10 10:45:58
 */
public class OffsetTimeAdaptor extends Adaptor<OffsetTime, String> {

    @Override
    protected String toTargetNotNull(OffsetTime offsetTime) {
        return offsetTime.format(DateTimeFormatter.BASIC_ISO_DATE);
    }

    @Override
    protected OffsetTime toSourceNotNull(String s) {
        return OffsetTime.parse(s, DateTimeFormatter.BASIC_ISO_DATE);
    }

}
