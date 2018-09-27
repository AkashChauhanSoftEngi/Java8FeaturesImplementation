package com.project.java.java8;

import java.util.HashMap;
import java.util.Map;

public class Java8ForMap {

	public static void main(String[] args) {
		map();
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
