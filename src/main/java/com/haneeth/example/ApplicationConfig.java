package com.haneeth.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Method 5

@Configuration
public class ApplicationConfig {
    @Bean
	public MyFirstClass myFirstClass(){
		return new MyFirstClass();
	}
}
