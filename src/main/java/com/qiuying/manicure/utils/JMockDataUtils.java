package com.qiuying.manicure.utils;

import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.MockConfig;
import com.qiuying.manicure.config.LocalDateMocker;
import com.qiuying.manicure.config.LocalDateTimeMocker;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author zhangyq
 * 生成随机数据
 */
public class JMockDataUtils {
    private static MockConfig config = new MockConfig();

    static {
        //时间处理
        config.registerMocker(new LocalDateMocker(), LocalDate.class);
        config.registerMocker(new LocalDateTimeMocker(), LocalDateTime.class);
        config.excludes("isDelete","imagePath");
    }

    public static <T> T mock(Class<T> classzz) {
        return JMockData.mock(classzz, config);
    }


}
