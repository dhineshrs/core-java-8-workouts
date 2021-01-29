package com.dlabs.java8_workouts.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		//System.out.println(collect);
		
		List<String> words = Arrays.asList("All the Best", "Good Luck", "Hello", "Welcome");
		List<Integer> wordsLength=words.stream().map(String::length).collect(Collectors.toList());
		wordsLength.forEach(System.out::println);
		
		Stream.of("a1", "a2", "a3")
	    .map(s -> s.substring(1))
	    .mapToInt(Integer::parseInt)
	    .max()
	    .ifPresent(System.out::println); 
		
		
	}

}
