package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {
	private String[] fortuneArray = {
			"To be or not to be, that is the question",
			"May fortune favour the foolish",
			"Alas, I knew poor Joric well",
			"The slings and arrows of outrageous fortune"
	};

	@Override
	public String getFortune() {
		int index = (int)Math.floor((4.0 * Math.random()));
		return fortuneArray[index];
	}

}
