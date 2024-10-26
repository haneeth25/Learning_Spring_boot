package com.haneeth.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Method 5

@Configuration
public class ApplicationConfig {
	// Bean naming you can give @bean or @bean("name")
    @Bean("myBean")
	public MyFirstClass myFirstClass(){
		return new MyFirstClass();
	}
}
