package com.spring.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaCodeSpringDemoApp {

	public static void main(String[] args) {
		
		//add config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve bean from context
		Coach newCoach=context.getBean("tennisCoach",Coach.class);
		
		//do method on bean
		System.out.println(newCoach.getDailyWorkout());
		System.out.println(newCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
