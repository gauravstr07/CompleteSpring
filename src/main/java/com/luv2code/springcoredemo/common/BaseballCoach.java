package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
	

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Baseball Coach";
	}

}
