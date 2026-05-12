package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach{
	
	public CricketCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());
	}
	
	// Define our init method
	@PostConstruct
	public void doMyStartupStuf() {
		System.out.println("In doMyStartupStuf : " + getClass().getSimpleName());
	}
	
	// Define our destroy method
	@PreDestroy
	public void doMyCleanupStuf() {
		System.out.println("In doMyCleanupStuf : " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 mins";
	}

}
