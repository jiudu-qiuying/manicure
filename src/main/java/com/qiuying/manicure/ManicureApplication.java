package com.qiuying.manicure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangyq
 */
@SpringBootApplication
@MapperScan("com.qiuying.manicure.mapper")
public class ManicureApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManicureApplication.class, args);
	}

}
