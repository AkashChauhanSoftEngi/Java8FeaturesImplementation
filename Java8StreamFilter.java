package com.project.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamFilter {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		
		/*To print out elements*/
		System.out.println(lines.stream().collect(Collectors.toList()));
		
		List<String> result = getFilterOutputBeforeJava8(lines, "mkyong");
		for (String temp : result) {
			System.out.println(temp); // output : spring, node
		}
		
		System.out.println();

		result = getFilterOutputAfterJava8(lines, "mkyong");
		result.forEach(item -> System.out.println(item));	// output : spring, node
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(2);
		l.add(3);
		l.add(8);
		l.add(9);
		List<Integer> k = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(k);
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
		return lines.stream().filter(item -> !name.equals(item)).collect(Collectors.toList());
	}

}
