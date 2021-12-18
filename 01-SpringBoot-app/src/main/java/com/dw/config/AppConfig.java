package com.dw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dw.service.util.DateUtils;

@Configuration
public class AppConfig {

	public AppConfig() {

		System.out.println("*****AppConfig::AppConfigConstructor*******");
	}

	@Bean
	public DateUtils getInstance() {
		return new DateUtils();
	}
}
