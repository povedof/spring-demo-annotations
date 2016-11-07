package com.povedof.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SoccerJavaConfigDemoApp {

	public static void main(String[] args) {
		//retrieve spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Practice7Config.class);
		
		//get the bean from spring container
		Coach theCoach = context.getBean("soccerCoach",SoccerCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();

	}

}
