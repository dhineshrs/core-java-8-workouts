package com.dlabs.java8_workouts.stream;

import java.util.Arrays;
import java.util.List;

public class CollectorsDemo {

	public static void main(String[] args) {
		 Emp john = new Emp("E123", "John Nhoj", 200.99, "IT");
	        Emp south = new Emp("E223", "South Htuos", 299.99, "Sales");
	        Emp reet = new Emp("E133", "Reet Teer", 300.99, "IT");
	        Emp prateema = new Emp("E143", "Prateema Rai", 300.99, "Benefits");
	        Emp yogen = new Emp("E323", "Yogen Rai", 200.99, "Sales");
		  List<Emp> Emps = Arrays.asList(john, south, reet, prateema, yogen);
		
		// calculating average
      //  Double averageSalary = Emps.stream().collect(averagingDouble(Emp::getSalary));
        System.out.println(averageSalary);

        // calculating total salary
        Double totalSalary = Emps.stream().collect(summingDouble(Emp::getSalary));
        System.out.println(totalSalary);

        // calculating all statistics at one shot
      //  DoubleSummaryStatistics statistics = Emps.stream().collect(summarizingDouble(Emp::getSalary));
        System.out.println("Average: " + statistics.getAverage() + ", Total: " + statistics.getSum() + ", Max: " + statistics.getMax() + ", Min: "+ statistics.getMin());

        // calculating max salary
        Double maxSalary = Emps.stream().collect(collectingAndThen(maxBy(comparingDouble(Emp::getSalary)), emp -> emp.get().getSalary()));
        System.out.println(maxSalary);

        // formatting result with collectingAndThen
        String avgSalary = Emps.stream()
                .collect(collectingAndThen(averagingDouble(Emp::getSalary), new DecimalFormat("'$'0.000")::format));
        System.out.println(avgSalary);

        // mapping data
        List<String> EmpNames = Emps.stream().collect(mapping(Emp::getName, toList())); //Emps.stream().map(Emp::getName).collect(toList());
        System.out.println(EmpNames);

        // collecting data into string
        String EmpNamesStr = Emps.stream().map(Emp::getName).collect(joining(","));
        System.out.println(EmpNamesStr);

        // collecting data into string with more format
        EmpNamesStr = Emps.stream().map(Emp::getName).collect(joining(", ", "Emps = {", "}"));
        System.out.println(EmpNamesStr);

        // grouping data with criteria
        Map<String, List<Emp>> deptEmps = Emps.stream().collect(groupingBy(Emp::getDepartment));
        System.out.println(deptEmps);

        // grouping data with criteria counting them
        Map<String, Long> deptEmpsCount = Emps.stream().collect(groupingBy(Emp::getDepartment, counting()));
        System.out.println(deptEmpsCount);

        // grouping data with criteria and averaging value sorted with key
        Map<String, Double> averageSalaryDeptSorted = Emps.stream().collect(groupingBy(Emp::getDepartment, TreeMap::new, averagingDouble(Emp::getSalary)));
        System.out.println(averageSalaryDeptSorted);

        // leveraging multi-core architectures; but return type would be ConcurrentHashMap
        System.out.println(Emps.stream().collect(groupingByConcurrent(Emp::getDepartment, counting())));

        // finding max
        Optional<Emp> EmpWithMaxSalary = Emps.stream().collect(maxBy(comparingDouble(Emp::getSalary)));
        EmpWithMaxSalary.ifPresent(System.out::println);

        // partitioning data
        Map<Boolean, List<Emp>> portionedEmps = Emps.stream().collect(partitioningBy(e -> e.getSalary() > averageSalary));
        System.out.println(portionedEmps);
    }
	}

}

class Emp {
    private String empId;
    private String name;
    private Double salary;
    private String department;

    public Emp(String empId, String name, Double salary, String department) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

}
