package com.project.java.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8ForList {

	public static void main(String[] args) {
		list();
	}
	
	public static void list() {
		
		System.out.println("Inside list");
		
		/* Normal for-loop to loop a List */
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		for (String item : items) {
			System.out.println(item);
		}

		/* forEach + lambda expression or method */
		items.forEach(item -> System.out.println(item));

		/*One more way to use forEach to print list*/
		items.forEach(System.out::println);
		
		/* Output:-C */
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println();
				System.out.println(item);
			}
		});
	}
}
