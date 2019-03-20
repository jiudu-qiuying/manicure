package com.qiuying.manicure;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author zhangyq
 */
@SpringBootApplication
public class ManicureApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManicureApplication.class, args);
	}

	@Bean
	public ObjectMapper serializingObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		objectMapper.registerModule(new JavaTimeModule());
		return objectMapper;
	}

}
