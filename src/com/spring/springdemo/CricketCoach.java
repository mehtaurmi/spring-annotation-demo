package com.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	//Field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Inside default constructor");
	}
	
	/*
	 //setters injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
		
	}*/
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do net practice for 2 hr";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
