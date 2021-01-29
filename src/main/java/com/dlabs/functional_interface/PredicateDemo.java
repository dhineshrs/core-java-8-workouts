package com.dlabs.java8_workouts.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		PredicateDemo predicateDemo = new PredicateDemo();
		// predicateDemo.predicateDemo1();
		// predicateDemo.predicateDemo2();
		// predicateDemo.predicateDemo3();
		predicateDemo.predicateDemo4();

	}

	public void predicateDemo1() {
		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i < 18);

		// Calling Predicate method
		System.out.println(lesserthan.test(10));
	}

	public void predicateDemo2() {

		Predicate<Integer> greaterThanTen = (i) -> i > 10;

		// Creating predicate
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);

		// Calling Predicate method
		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
		System.out.println(result2);
	}

	// Example 3: Predicate in to Function
	public void predicateDemo3() {
		pred(10, (i) -> i > 7);
	}

	public void pred(int n, Predicate<Integer> predicate) {
		if (predicate.test(n)) {
			System.out.println("Predicate in to Function : " + n);

		}
	}

	public void predicateDemo4() {
		List<User> users = new ArrayList<User>();
		users.add(new User("John", "admin"));
		users.add(new User("Peter", "member"));

		List admins = process(users, (User u) -> u.getRole().equals("admin"));
		System.out.println(admins);
	}

	public static List<User> process(List<User> users, Predicate<User> predicat) {
		List<User> result = new ArrayList<User>();
		for (User user : users)
			if (predicat.test(user))
				result.add(user);
		return result;
	}

}

class User {
	String name, role;

	User(String a, String b) {
		name = a;
		role = b;
	}

	String getRole() {
		return role;
	}

	String getName() {
		return name;
	}

	public String toString() {
		return "User Name : " + name + ", Role :" + role;
	}
}
