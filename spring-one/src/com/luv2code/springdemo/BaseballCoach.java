package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	// define a private field for the dependency
	private HappyFortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(HappyFortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}

}
