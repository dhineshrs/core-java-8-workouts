package com.dlabs.java8_workouts.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIDemo {

	public static void main(String[] args) {
		StreamAPIDemo streamAPIDemo = new StreamAPIDemo();
		//streamAPIDemo.testOne();
		//streamAPIDemo.beforeJava8();
		
		streamAPIDemo.AMCAT_TalentHunt_CodeTest();
		
	}

	public void testOne() {
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
	}

	// Before Java8
	public void beforeJava8() {
		List<String> lines = Arrays.asList("string-one", "string-two", "string-three", "string-four");
		List<String> result = getFilterOutput(lines, "string-two");
		for (String temp : result) {
			System.out.println(temp);
		}
	}

	private static List<String> getFilterOutput(List<String> lines, String filter) {
		List<String> result = new ArrayList<>();
		for (String line : lines) {
			if (!"string-two".equals(line)) {
				result.add(line);
			}
		}
		return result;
	}
	
	//Using Java8 Stream
	public void usingJava8() {
		List<String> lines = Arrays.asList("string-one", "string-two", "string-three", "string-four");
		 List<String> result = lines.stream()                // convert list to stream
	                .filter(line -> !"string-two".equals(line))     // we dont like string-two
	                .collect(Collectors.toList());              // collect the output and convert streams to a List

	        result.forEach(System.out::println);                //output : string-one, string-three, string-four

	}
	
	//	Streams filter(), findAny() and orElse()
	
	public static void AMCAT_TalentHunt_CodeTest () {
		// String name = "java";
		 String name2 = null;

		//System.out.println("--------------------" + opt);
		 
		 List<String> iceCreames = new ArrayList<String>();
		
		 iceCreames.add(1,"chocklate");
		 iceCreames.add(2, "butterscotch");
		 iceCreames.add(3, "vennila");
		
		
	}
	
}
