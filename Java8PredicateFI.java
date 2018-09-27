package com.project.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class EmployeeTwo{
	
	String name;
	double salary;
	
	public EmployeeTwo(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}

public class Java8PredicateFI {

	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0?true:false;
		System.out.println(p.test(4));
		System.out.println(p.test(5));
		
		Predicate<String> p2=s->s.length()>5?true:false;
		System.out.println(p2.test("Akash"));
		System.out.println(p2.test("Akash Chauhan"));
		
		List<EmployeeTwo> list = new ArrayList<EmployeeTwo>();
		list.add(new EmployeeTwo("Aka", 1235));
		list.add(new EmployeeTwo("Ak", 1236));
		list.add(new EmployeeTwo("h", 1237));
		list.add(new EmployeeTwo("sh", 1238));
		list.add(new EmployeeTwo("kash", 1239));
		list.add(new EmployeeTwo("A", 1231));
		
		Predicate<EmployeeTwo> q=e->e.salary>1236?true:false;
				
		for(EmployeeTwo e: list){
			if(q.test(e))System.out.println(e.name + ": " + e.salary);
		}
		System.out.println();
		Predicate<EmployeeTwo> r=e->e.salary<1239?true:false;
		for(EmployeeTwo e: list){
			if(r.and(q).test(e))System.out.println(e.name + ": " + e.salary);
		}
	}
}
