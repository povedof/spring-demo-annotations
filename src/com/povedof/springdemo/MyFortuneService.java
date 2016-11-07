package com.povedof.springdemo;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFortuneService implements FortuneService {

	@Value("${fortunes}")
	private String[] myFortunes;
	
	// create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(myFortunes.length);
		String theFortune = myFortunes[index];
		return theFortune;
	}
	
	@PostConstruct
	private void readFortunes(){
		System.out.println(Arrays.toString(myFortunes));
	}

}
