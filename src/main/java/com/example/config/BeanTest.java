package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanTest {
	
	@Bean
	public Count inclement() {
		return new Count();
	}
}
