package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 mins..!";
	}

}
