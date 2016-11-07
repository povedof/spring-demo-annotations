package com.povedof.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Lift weights the whole morning";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
