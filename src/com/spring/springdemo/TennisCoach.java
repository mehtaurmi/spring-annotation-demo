package com.spring.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	private FortuneService fortuneService;
	
	
	//create a constructor
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService")FortuneService theFortuneService)
	{
		System.out.println("Inside Tenniscouach constructor");
		fortuneService=theFortuneService;
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside TennisCoach:doMyStartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside TenissCoach:doMyCleanupStuff");
	}
	@Override
	public String getDailyWorkout() {
		return "Do some practice for 1 hr";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
