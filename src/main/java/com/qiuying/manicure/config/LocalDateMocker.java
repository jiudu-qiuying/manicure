package com.qiuying.manicure.config;

import com.github.jsonzou.jmockdata.DataConfig;
import com.github.jsonzou.jmockdata.Mocker;

import java.time.LocalDate;

/**
 * @author zhangyq
 * 解决mock数据无法处理localdate类型问题
 */
public class LocalDateMocker implements Mocker<Object> {

    @Override
    public Object mock(DataConfig dataConfig) {
        return LocalDate.now();
    }
}
