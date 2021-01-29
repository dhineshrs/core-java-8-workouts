package com.dlabs.java8_workouts.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOperationDemo {

	public static void main(String[] args) {

	}
	
	
	void hashMapDemo() {
		Map<Integer, Employee> hashMap = new HashMap<>();
		Employee emp1 = new Employee(124, "sachin", "kumar", 8900.00);
		Employee emp2 = new Employee(125, "Rahul", "Dravid", 6800.00);
		Employee emp3 = new Employee(126, "Virat", "kholi", 10000.00);
		hashMap.put(emp1.empId, emp1);
		hashMap.put(emp2.empId, emp2);
		hashMap.put(emp3.empId, emp3);
		
		hashMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue()));
		
	}

}
