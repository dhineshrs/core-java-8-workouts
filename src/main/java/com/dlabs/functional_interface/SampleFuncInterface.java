package com.dlabs.java8_workouts.functional_interface;

//which can be used for compiler level errors when the interface you have annotated is not a valid Functional Interface.
@FunctionalInterface
public interface SampleFuncInterface {

	// abstract method
	public void doWork1();

	// The interface can also declare the abstract methods from the java.lang.Object
	// class, but still the interface can be called as a Functional Interface:
	public String toString();

	public boolean equals(Object o);

	// Once you add another abstract method to the interface
	// then the compiler/IDE will flag it as an error abstract method
	// public void doWork2();
}

//Interface can extend another interface 
// and in case the Interface it is extending in functional
// and it doesn’t declare any new abstract methods 
// then the new interface is also functional. 
interface ComplexFuncInterface extends SampleFuncInterface {

	default public void doSomeWork() {
		System.out.println("Doing some work in interface impl..");
	}

	default public void doOtherWork() {
		System.out.println("Doing other work in interface impl..");
	}
}


	
