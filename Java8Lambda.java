package com.project.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Java8Lambda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter true if using Lambda otherwise enter false");
		boolean lambda = sc.nextBoolean();
		sc.close();
		ComparatorTest test = new ComparatorTest();
		test.comparator(getStudents(), lambda);
	}

	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Aayush", "Chauhan", 75, 25));
		students.add(new Student("Ashutosh", "Rana", 76, 24));
		students.add(new Student("Palak", "Chauhan", 77, 28));
		students.add(new Student("Nitin", "Chauhan", 79, 27));
		return students;
	}

}

class ComparatorTest {
	public void comparator(List<Student> students, boolean lambda) {

		/* Before Sorting */
		System.out.println("Before sort");
		for (Student student : students) {
			System.out.println(student);
		}

		if (lambda) {
			students.sort((Student s1, Student s2)->s1.getAge()-s2.getAge());
			
		} else {
			/* Sorting by age without using Lambda */
			Collections.sort(students, new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					return o1.getAge() - o2.getAge();
				}

			});
		}

		/* After Sorting */
		System.out.println("\nBefore sort");
		for (Student student : students) {
			System.out.println(student);
		}
	}
}

class Student {

	String firstName;
	String lastName;
	int totalMarks;
	int age;

	public Student(String firstName, String lastName, int totalMarks, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalMarks = totalMarks;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", totalMarks=" + totalMarks + ", age="
				+ age + "]";
	}
}
