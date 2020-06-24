package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Oh-de-de-dah de-de-de um-ben-bah";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}

}
