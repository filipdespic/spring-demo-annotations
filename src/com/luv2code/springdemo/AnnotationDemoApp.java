package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach vCoach = context.getBean("volleyballCoach", Coach.class);
		
		// call a method on the bean
		System.out.println("Tennis: "+coach.getDailyWorkout());

		System.out.println("Volleyball: "+vCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(coach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
