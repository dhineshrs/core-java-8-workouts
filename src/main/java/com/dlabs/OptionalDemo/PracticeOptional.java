package com.dlabs.java8_workouts.OptionalDemo;

import java.util.Optional;

public class PracticeOptional {
	
	PracticeOptional() {
		AMCAT_TalentHunt_CodeTest();
		
		//myFirstTest();
	}
	public void AMCAT_TalentHunt_CodeTest () {
		// String name = "java";
		 String name2 = null;
		Optional<String> opt = Optional.of(name2);

		//System.out.println("--------------------" + opt);
		
		
		
		
	}

	public void myFirstTest() {
		// TODO Auto-generated method stub

		Optional<String> empty = Optional.empty();

		System.out.println("--------------------" + empty);

		// Creating an optional using of
		String name = "java";
		// String name2 = null;
		Optional<String> opt = Optional.of(name);

		System.out.println("--------------------" + opt);

		// Possible null value
		Optional<String> optional = Optional.ofNullable(name());
		System.out.println("---------name()-----------" + name());
		System.out.println("---------optional-----------" + optional);
		
		//ispresent
		Optional<String> optional1 = Optional.of("javaone");
		//Optional<String> optional1 = Optional.of(null);
		if (optional1.isPresent()){   
		  //Do something, normally a get
			System.out.println("---------isPresent-----" + optional1.isPresent());
		}
		System.out.println("---------isPresent-----------" + optional1.isPresent());

	}

	private static String name() {
		String name = "Java";
		return (name.length() > 5) ? name : null;
	}
	
	public static void main(String[] args) {
		PracticeOptional po = new PracticeOptional();

	}
	
}
