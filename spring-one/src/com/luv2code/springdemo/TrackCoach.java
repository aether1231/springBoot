package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune
		
		return "Just do it: " + fortuneService.getFortune();
	}
}
