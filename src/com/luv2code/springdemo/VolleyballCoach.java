package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Jump and block the ball!";
	}

}