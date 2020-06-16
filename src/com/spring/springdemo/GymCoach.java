package com.spring.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return email+"       "+team;
	}

}
