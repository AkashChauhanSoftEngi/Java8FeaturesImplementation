package com.project.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	public String name;
	public Integer employeeId;
	
	public Employee(String name, Integer employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return employeeId + ": " + name;
	}
}

public class Java8CollectionUsingLambdaExpusingOwnObj {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Akash", 123455));
		l.add(new Employee("Bkash", 123454));
		l.add(new Employee("Ckash", 123453));
		l.add(new Employee("Dkash", 123452));
		l.add(new Employee("Ekash", 123451));
		Collections.sort(l, (e1,e2)->(e1.employeeId<e2.employeeId)?-1:(e1.employeeId>e2.employeeId)?1:0);
		l.stream().forEach(System.out::println);
		
		System.out.println("");
		
		/*Sort based on Alphabetical order(Comparable.compareTo(...) follow Alphabetical order by default)*/
		Collections.sort(l, (e1,e2)->e1.name.compareTo(e2.name));
		l.stream().forEach(System.out::println);
	}
}
