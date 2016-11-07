package com.povedof.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	@Autowired
	@Qualifier("myFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach(){
		System.out.println(">> Tennis Coach: inside default constructor");
	}
	
	// define my initial method
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println(">> Tennis Coach: inside of doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy //not called when using PROTOTYPE SCOPE
	public void doMyCleanupStuff(){
		System.out.println(">> Tennis Coach: inside of doMyCleanupStuff()");
	}
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> Tennis Coach: inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout(){
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
