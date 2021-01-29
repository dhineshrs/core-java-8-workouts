package com.dlabs.java8_workouts.lamdas;

public class LamdaDemoOne {

	public static void main(String[] args) {

	}

	// Lambda Expressions vs. Anonymous Interface Implementations
	// Even though lambda expressions are close to anonymous interface
	// implementations, there are a few differences that are worth noting.
	// The major difference is, that an anonymous interface implementation
	// can have state (member variables) whereas a lambda expression cannot. Look at
	// this interface:
	public interface MyEventConsumer {

		public void consume(Object event);

	}

	// This interface can be implemented using an anonymous interface
	// implementation, like this:

	MyEventConsumer consumer = new MyEventConsumer() {
		public void consume(Object event) {
			System.out.println(event.toString() + " consumed");
		}
	};

	// This anonymous MyEventConsumer implementation can have its own internal
	// state. Look at this redesign:

	MyEventConsumer myEventConsumer = new MyEventConsumer() {
		private int eventCount = 0;

		public void consume(Object event) {
			System.out.println(event.toString() + " consumed " + this.eventCount++ + " times.");
		}
	};
	
	//Notice how the anonymous MyEventConsumer implementation now has a field named eventCount.
	//A lambda expression cannot have such fields. A lambda expression is thus said to be stateless.
	
	
	
}
