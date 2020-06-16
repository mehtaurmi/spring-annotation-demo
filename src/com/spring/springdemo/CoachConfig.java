package com.spring.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {

	@Bean
	public FortuneService todayFortuneService() {
		return new TodayFortuneService();
	}
	
	@Bean
	public Coach footballCoach() {
		return new FootballCoach(todayFortuneService());
	}
}
