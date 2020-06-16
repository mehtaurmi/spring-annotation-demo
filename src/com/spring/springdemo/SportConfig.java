package com.spring.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("Sports.properties")
//@ComponentScan("com.spring.springdemo")
public class SportConfig {
	
	//create a bean for sadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//create a bean for swimcoach with DI of sadFortuneService
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
