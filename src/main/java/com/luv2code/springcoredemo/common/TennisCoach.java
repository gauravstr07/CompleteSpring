package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	public TennisCoach() {
		System.out.println("Tennis Coach");
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Tennis Coach";
	}

}
