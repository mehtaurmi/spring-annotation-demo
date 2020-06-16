package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationDemoApp {

	public static void main(String[] args) {
		
		//add config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from context
		Coach newCoach=context.getBean("tennisCoach",Coach.class);
		
		//do method on bean
		System.out.println(newCoach.getDailyWorkout());
		System.out.println(newCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
