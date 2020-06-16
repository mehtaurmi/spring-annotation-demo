package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationPracticeApp {

	public static void main(String[] args) {
		// add config File
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean
		Coach coach=context.getBean("practiceCoach",Coach.class);
		
		//Do method on bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
