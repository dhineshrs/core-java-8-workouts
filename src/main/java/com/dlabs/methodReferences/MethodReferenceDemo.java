package com.dlabs.java8_workouts.methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodReferenceDemo {

	public static void main(String[] args) {

		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

		//methodReferenceDemo.demo1();
		
		//static methodReference
		System.out.println("\nstatic methodReference : " );
		methodReferenceDemo.demo1();
		
		//ClassInstance methodReference
		System.out.println("\nClassInstance methodReference : " );
		methodReferenceDemo.demo3();
				
		//constructor methodReference
		System.out.println("\nconstructor methodReference : " );
		methodReferenceDemo.demo5();

	}

	//Method reference to static method – Class::staticMethodName
	void demo1() {
		List<Integer> integers = Arrays.asList(1,12,433,5);
		Optional<Integer> max = integers.stream().reduce( Math::max );
		max.ifPresent(value -> System.out.println(value));
	}
	
	//  Method reference to instance method from instance – ClassInstance::instanceMethodName
	void demo3() {
		List<Integer> integers = Arrays.asList(1, 12, 433, 5);
		Optional<Integer> max = integers.stream().reduce(Math::max);
		max.ifPresent(System.out::println);
	}
	
	//  Method reference to instance method from class type – Class::instanceMethodName
	void demo4() {
		List<String> strings = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");

		List<String> sorted = strings.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());

		System.out.println(sorted);

		List<String> sortedAlt = strings.stream().sorted(String::compareTo).collect(Collectors.toList());

		System.out.println(sortedAlt);
	}

	//Reference to constructor – Class::new
	void demo5() {
		List<Integer> integers = IntStream.range(1, 100).boxed().collect(Collectors.toCollection(ArrayList::new));

		Optional<Integer> max = integers.stream().reduce(Math::max);

		max.ifPresent(System.out::println);
	}
	
}
