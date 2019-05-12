package com.github.sisyphsu.nakedata.convertor.adaptor.time;

import com.github.sisyphsu.nakedata.convertor.adaptor.Adaptor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * {@link LocalDateTime}与{@link Long}的类型转换适配器
 *
 * @author sulin
 * @since 2019-05-10 10:43:53
 */
public class LocalDateTimeAdaptor extends Adaptor<LocalDateTime, Long> {

    @Override
    protected Long toTargetNotNull(LocalDateTime localDateTime) {
        return localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
    }

    @Override
    protected LocalDateTime toSourceNotNull(Long aLong) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(aLong), ZoneOffset.UTC);
    }

}