package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSnsApplication.class, args).getBean(SimpleSnsApplication.class);
	}

}
