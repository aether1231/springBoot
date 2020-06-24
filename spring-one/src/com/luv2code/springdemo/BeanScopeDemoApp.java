package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// get the beans
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theAlphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == theAlphaCoach); 
		
		// print the result
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for theAlphaCoach: " + theAlphaCoach);
		
		// close the context
		context.close();
	}

}
