package com.spring.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeActivity7App {

	public static void main(String[] args) {
		
		//add java config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CoachConfig.class);
		
		//retrieve a bean
		Coach coach=context.getBean("footballCoach",Coach.class);
		
		//do a method on bean
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
