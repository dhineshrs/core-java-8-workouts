package com.dlabs.java8_workouts.functional_interface;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {

		BiConsumerDemo biConsumerDemo = new BiConsumerDemo();
		biConsumerDemo.demo2();

	}

	void demo1() {

		BiConsumer<Integer, String> consumer = (a, b) -> System.out.println(a + b);
		consumer.accept(5, "chapters");
	}

	void demo2() {
		BiConsumer<Integer, Integer> addition = (a, b) -> System.out.println(a + b);
		BiConsumer<Integer, Integer> subraction = (a, b) -> System.out.println(a - b);

		// using addThen
		addition.andThen(subraction).accept(10, 6);
	}
}
