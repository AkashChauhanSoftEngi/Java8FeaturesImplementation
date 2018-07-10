package com.project.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Using 
 * 
 * */

public class Java8StreamFilter {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		List<String> result = getFilterOutputBeforeJava8(lines, "mkyong");
		for (String temp : result) {
			System.out.println(temp); // output : spring, node
		}
		
		System.out.println();

		result = getFilterOutputAfterJava8(lines, "mkyong");
		result.forEach(item -> System.out.println(item));	// output : spring, node
	}

	public static List<String> getFilterOutputBeforeJava8(List<String> lines, String name) {
		List<String> modify = new ArrayList<>();
		for (String s : lines) {
			if (!s.equalsIgnoreCase(name)) {
				modify.add(s);
			}
		}
		return modify;
	}
	
	public static List<String> getFilterOutputAfterJava8(List<String> lines, String name) {
		return lines.stream().filter(line -> !name.equals(line)).collect(Collectors.toList());
	}

}
