package com.haneeth.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class ExampleApplication {

	// Method 1 of creating bean
//	@Bean
//	public MyFirstClass myFirstClass(){
//		return new MyFirstClass();
//	}

	public static void main(String[] args) {
		// Programmatically we can call profiles in this way
		var app = new SpringApplication(ExampleApplication.class);
		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active","dev"));
		var ctx = app.run(args);

		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAsStory());
		System.out.println(myFirstService.getJavaVersion());
		System.out.println(myFirstService.getOs());
		System.out.println(myFirstService.getProperty());
		}
}
