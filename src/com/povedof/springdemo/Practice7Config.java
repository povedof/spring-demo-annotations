package com.povedof.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Practice7Config {
	
	@Bean
	public FortuneService crazyFortuneService(){
		return new CrazyFortuneService();
	}
	
	@Bean
	public Coach soccerCoach(){
		return new SoccerCoach(crazyFortuneService());
	}

}
