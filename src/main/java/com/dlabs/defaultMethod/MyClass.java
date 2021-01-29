package com.dlabs.java8_workouts.defaultMethod;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2(String str) {

	}

	@Override
	public void method1(String str) {

	}

	// Interface1's default log method implementation
	@Override
	public void log(String str) {
		// Interface1's default log method implementation
		 Interface1.super.log(str);

		// Interface2's default log method implementation
		// Interface2.super.log(str);
	}

	public static void main(String ar[]) {
		MyClass myClass = new MyClass();
		myClass.log("Hello..");
	}
	
	/* 1. Java interface default methods will help us in extending interfaces 
	      without having the fear of breaking implementation classes.
	  2. Java interface default methods has bridge down the differences between interfaces and abstract classes.
	  3. Java 8 interface default methods will help us in avoiding utility classes, 
	     such as all the Collections class method can be provided in the interfaces itself.
	  4. Java interface default methods will help us in removing base implementation classes, 
	     we can provide default implementation and the implementation classes can chose which one to override.
	  5. One of the major reason for introducing default methods in interfaces is,
	     to enhance the Collections API in Java 8 to support lambda expressions.
	  6. If any class in the hierarchy has a method with same signature, 
	     then default methods become irrelevant.
	     A default method cannot override a method from java.lang.Object. The reasoning is very simple, 
	     it’s because Object is the base class for all the java classes. So even if we have Object class methods 
	     defined as default methods in interfaces, it will be useless because Object class method will always be used.
	     That’s why to avoid confusion, we can’t have default methods that are overriding Object class methods.
	     Java interface default methods are also referred to as Defender Methods or Virtual extension methods.*/
	
	/*	Abstract Classes Versus Interfaces in Java 8
		After introducing Default Method, it seems that interfaces and abstract classes are the same. 
		However, they are still a different concept in Java 8.
		
		1. The abstract class can define constructors. 
		    1.1 They are more structured and can have a state associated with them. 
		2. While in contrast, default method can be implemented only in the terms of invoking other interface methods, 
		    with no reference to a particular implementation's state. 
		    Hence, both are used for different purposes and choosing between two really depends on the scenario context.*/
}
