package com.spring.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService theFortuneService)
	{
		System.out.println("Inside footballCoach constructor");
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
