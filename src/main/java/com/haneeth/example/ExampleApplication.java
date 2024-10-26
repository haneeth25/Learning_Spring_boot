package com.haneeth.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	// Method 1 of creating bean
//	@Bean
//	public MyFirstClass myFirstClass(){
//		return new MyFirstClass();
//	}

	public static void main(String[] args) {
		var ctx = SpringApplication.run(ExampleApplication.class, args);

		// To see all created beans
//		for (var i : ctx.getBeanDefinitionNames()){
//			System.out.println(i);
//		}

		// Normal way to call method in a class

		//MyFirstClass myFirstClass = new MyFirstClass();

		MyFirstClass myFirstClass = ctx.getBean(MyFirstClass.class);
		System.out.println(myFirstClass.sayHello());
		}
}
