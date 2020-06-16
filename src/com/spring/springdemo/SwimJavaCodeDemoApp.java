package com.spring.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaCodeDemoApp {

	public static void main(String[] args) {
		
		//add config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve bean from context
		SwimCoach newCoach=context.getBean("swimCoach",SwimCoach.class);
		
		//do method on bean
		System.out.println(newCoach.getDailyWorkout());
		System.out.println(newCoach.getDailyFortune());
		
		//write new method for swimcoach...with injected props value
		System.out.println("Email:"+newCoach.getEmail());
		System.out.println("Team:"+newCoach.getTeam());
		//close the context
		context.close();

	}

}
