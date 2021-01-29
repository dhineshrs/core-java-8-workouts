package com.dlabs.java8_workouts.defaultMethod;

public interface Interface2 {

	void method2(String str);

	// Java Interface Default Method
	default void log(String str) {
		System.out.println("I2 logging::" + str);
	}

}
