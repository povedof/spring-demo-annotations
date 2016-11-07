package com.povedof.springdemo;

public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	public SoccerCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Kick 10 penalties";
	}

	@Override
	public String getDailyFortune() {
		return "Kick it like Beckham";
	}

}
