package com.project.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* ## Function FI
 * Function<T,R> : R apply(T)
 * Not restricted to boolean return type only like predicate
 * */

class StudentSample {

	String name;
	double marks;

	public StudentSample(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

}

public class Java8FunctionFI {

	public static void main(String[] args) {

		Function<Integer, Integer> f = i -> i * i;
		Function<String, Integer> f2 = s -> s.length();
		Function<String, String> f3 = s -> s.toUpperCase();

		System.out.println("Square of 4:" + f.apply(4));
		System.out.println("Square of 5:" + f.apply(5));
		System.out.println("Length of the String: " + f2.apply("Akash"));
		System.out.println("In Upper Case: " + f3.apply("akash"));
		System.out.println();

		List<StudentSample> obj = new ArrayList<>();
		obj.add(new StudentSample("Akash", 120));
		obj.add(new StudentSample("Vikash", 100));
		obj.add(new StudentSample("kash", 90));
		obj.add(new StudentSample("sh", 60));
		obj.add(new StudentSample("Mahesh", 80));
		obj.add(new StudentSample("MaheshTwo", 40));

		Function<StudentSample, String> f4 = s -> {
			double marks = s.marks;
			String grade = "";
			if (marks > 100)
				grade = "First";
			else if (marks > 80)
				grade = "Second";
			else if (marks > 60)
				grade = "Third";
			else
				grade = "Fail";
			return grade;
		};

		Predicate<StudentSample> p = s -> s.marks >= 60;
		
		Consumer<StudentSample> c= s1->{
			System.out.println("Name: " + s1.name);
			System.out.println("Marks: " + s1.marks);
			System.out.println("Grade: " + f4.apply(s1));
			System.out.println();
		};

		for (StudentSample s : obj) {
			if (p.test(s)) {
				c.accept(s);
			}
		}
		
		/* compose and andThen chaining */
		Function<Integer, Integer> f5 = i -> 2 * i;
		Function<Integer, Integer> f6 = i -> i * i * i;
		System.out.println(f5.andThen(f6).apply(2));
		System.out.println(f5.compose(f6).apply(2));
	}
}
