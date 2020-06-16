package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeWithAnnotationsApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach newCoach=context.getBean("tennisCoach",Coach.class);
		
		Coach oldCoach=context.getBean("tennisCoach",Coach.class);
		
		boolean result=(newCoach==oldCoach);
		
		System.out.println("Both pointing to same location?"+result);
		System.out.println("Location if newCoach:"+newCoach);
		System.out.println("Location of oldCoach:"+oldCoach);

	}

}
