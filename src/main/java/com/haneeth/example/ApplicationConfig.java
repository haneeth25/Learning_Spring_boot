package com.haneeth.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Method 5

//@Configuration
//public class ApplicationConfig {
//	// Since constructor with parameter we need to use value here
//    //@Bean("myBean")
//	public MyFirstClass myFirstClass(){
//		return new MyFirstClass("my var");
//	}
//
//	@Bean
//	public MyFirstClass mySecondClass(){
//		return new MyFirstClass("my second var");
//	}
//}


// Two beans of same type.
//@Configuration
//public class ApplicationConfig {
//	// Since constructor with parameter we need to use value here
//    @Bean
//	@Qualifier("bean1")
//	public MyFirstClass myFirstClass(){
//		return new MyFirstClass("my var");
//	}
//
//	@Bean
//	@Qualifier("bean2")
//	public MyFirstClass mySecondClass(){
//		return new MyFirstClass("my second var");
//	}
//}


@Configuration
public class ApplicationConfig {
	// Since constructor with parameter we need to use value here
	@Bean
	public MyFirstClass myFirstClass(){
		return new MyFirstClass("my var");
	}

	@Bean
	@Primary // Give high priority for this bean
	public MyFirstClass mySecondClass(){
		return new MyFirstClass("my primary");
	}
}
