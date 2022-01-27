package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {
	private FortuneService fortuneService;
	
	
	public VolleyballCoach() {
		System.out.println("VolleybalCoach: inside default constructor.");
	}


	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Jump and block the ball!";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
