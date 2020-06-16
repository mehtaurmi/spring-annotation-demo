package com.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PracticeCoach implements Coach {
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public PracticeCoach() {
		System.out.println("Inside PracticeCoach constructor");
	}
	@Override
	public String getDailyWorkout() {
		
		return null;
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
