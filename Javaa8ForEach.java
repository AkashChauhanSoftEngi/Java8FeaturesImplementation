package com.project.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Javaa8ForEach {

	public static void main(String[] args) {

		list();
		map();
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

		/* Output:-C */
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println();
				System.out.println(item);
			}
		});
	}

	public static void map() {

		System.out.println("Inside Map");
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		/* Normal for-loop to loop a Map */
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

		/* forEach + lambda expression */
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		/* Output:-C */
		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("C".equals(k)) {
				System.out.println("C");
			}
		});
	}

}
