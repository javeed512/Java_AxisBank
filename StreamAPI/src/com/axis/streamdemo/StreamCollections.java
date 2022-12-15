package com.axis.streamdemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.axis.streamdemo.entity.Employee;

public class StreamCollections {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(101, "Javeed", 50000, LocalDate.now()));
		empList.add(new Employee(102, "Smith", 70000, LocalDate.now()));
		empList.add(new Employee(103, "Abishek", 40000, LocalDate.now()));
		empList.add(new Employee(104, "Himanshu", 90000, LocalDate.now()));
		empList.add(new Employee(105, "Tejasree", 6000, LocalDate.now()));
		empList.add(new Employee(106, "Tom", 50000, LocalDate.now()));
		empList.add(new Employee(107, "Ford", 30000, LocalDate.now()));

		Stream<Employee> stream = empList.stream();

		// stream.forEach((emp)->{System.out.println(emp);});

		stream.filter((emp) -> {
			return emp.getEname().length() > 4;
		}).map((emp) -> {
			System.out.println(emp.getEname());
			return emp.getEname().length();
		}).forEach(System.out::println);

		Stream<Employee> stream2 = empList.stream();

		stream2.map((emp) -> {
			return emp.getSalary();
		}).sorted().limit(empList.size()).distinct().forEach(System.out::println); // limit(4) ,skip(4)

		
		Stream<Employee> stream3 = empList.stream();
		
			Comparator<Employee> comparator = (e1,e2)->{ 	
				
													Double d1 = e1.getSalary(); 
													Double d2 = e2.getSalary();
													
													String s1 = d1.toString();
													String s2 = d2.toString();
			
													return s1.compareTo(s2);
											};
		
		
	Employee emp =	stream3.max(comparator).orElse(null); 
		
			//System.out.println(emp.getSalary());
			
			
	Stream<Employee> stream4 = empList.stream();
	
		
			Double total = stream4.map((emp1)->{return emp1.getSalary();})
							.reduce((s1,s2)->{return s1+s2;}).orElse(0.0);
				
			System.out.println("Sum of Salaries "+total);
			
			Stream<Employee> stream5 = empList.stream();
			
		stream5.filter((e1)->{return e1.getEname().equals("Tom"); })
				.map((e2)->{return e2.getDoj().getYear();})
				.forEach(System.out::println);
			
			
		
		
	}

}
