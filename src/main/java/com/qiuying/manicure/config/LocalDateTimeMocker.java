package com.qiuying.manicure.config;

import com.github.jsonzou.jmockdata.DataConfig;
import com.github.jsonzou.jmockdata.Mocker;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author zhangyq
 * 解决mock数据无法处理LocalDateTime类型问题
 */
public class LocalDateTimeMocker implements Mocker<Object> {

    @Override
    public Object mock(DataConfig dataConfig) {
        return LocalDateTime.now();
    }
}
