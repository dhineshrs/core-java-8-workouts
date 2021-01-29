package com.dlabs.java8_workouts.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemoTwo {

	public static void main(String[] args) {

		// generateStreamsFromOtherDataStructures();
		// convertStreamsToOtherDataStructures();
		intermediateOperations();

	}

	// Generate Streams from other DataStructures
	public static void generateStreamsFromOtherDataStructures() {

		// Generate Streams from Arrays using .stream or Stream.of.
		String[] testArray = { "a", "b", "c", "d", "e" };

		// Get Stream using the Arrays.stream
		Stream<String> testStream1 = Arrays.stream(testArray);
		testStream1.forEach(x -> System.out.println(x));

		// Get Stream using the Stream.of
		Stream<String> testStream2 = Stream.of(testArray);
		testStream2.forEach(x -> System.out.println(x));
		System.out.println("-----------");

		// Generate Streams from Collections.
		List<String> items = new ArrayList<>();
		items.add("test1");
		items.add("test2");
		items.add("test3");
		items.add("test4");
		items.add("test5");
		items.stream().forEach(item -> System.out.println(item));
		System.out.println("-----------");

		// Generate Streams using Stream.generate()
		Stream<String> stream = Stream.generate(() -> "hello").limit(3);
		String[] testStrArr = stream.toArray(String[]::new);
		System.out.println(Arrays.toString(testStrArr));
		System.out.println("-----------");

		// Generate Streams using Stream.iterate().
		Stream<Long> iterateNumbers = Stream.iterate(1L, n -> n + 1).limit(10);
		iterateNumbers.forEach(System.out::println);
		System.out.println("-----------");

		// Generate Streams from APIs like Regex.
		String str = "THIS,IS,JAVA!!!!!";
		Pattern.compile(",").splitAsStream(str).forEach(System.out::println);

	}

	public static void convertStreamsToOtherDataStructures() {
		// Get Collections using stream.collect(Collectors.toList())
		Stream<String> streams = Stream.of("java", "in", "use");
		List<String> testNames = streams.collect(Collectors.toList());
		System.out.println(testNames);
		System.out.println("-----------");

		// Get arrays using stream.toArray(EntryType[]::new)
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Stream<Integer> intStream = list.stream();
		Integer[] evenArr = intStream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.print(evenArr[0]);
		System.out.println("-----------");

	}

	public static void intermediateOperations() {

		// filter() operation helps eliminate elements based on certain criteria.
		List<String> data1 = Arrays.asList("java", "not", "in", "use");
		data1.stream().filter(line -> !"not".equals(line)).forEach(p -> System.out.println(p));
		System.out.println("-----------");

		// map() operation helps map elements to the corresponding results.
		List<String> data2 = Arrays.asList("java", "not", "in", "use");
		data2.stream().filter((s) -> !s.startsWith("n")).map(String::toUpperCase).forEach(System.out::println);

	}
}
