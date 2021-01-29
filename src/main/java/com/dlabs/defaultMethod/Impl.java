package com.dlabs.java8_workouts.defaultMethod;

interface InterfaceA {
	default void defaultMethod() {
		System.out.println("Interface A default method");
	}
}

interface InterfaceB {
	default void defaultMethod() {
		System.out.println("Interface B default method");
	}
}

public class Impl implements InterfaceA, InterfaceB {

	public static void main(String ar[]) {
		Impl impl = new Impl();
		impl.defaultMethod();
	}

	/*
	 * if we want to invoke default implementation provided by any super interface
	 * rather than our own implementation, we can do so as follows
	 */
	public void defaultMethod() {
		InterfaceA.super.defaultMethod();
	}

	/*	## Difference Between Default Method and Regular Method ##
	    Default Method is different from the regular method in the sense that 
	   	default method comes with default modifier. 
	   	Additionally, methods in classes can use and modify method arguments 
	   				  as well as the fields of their class, 
	   				  but default method, on the other hand, 
	   				  can only access its arguments as interfaces do not have any state.
    */
}
