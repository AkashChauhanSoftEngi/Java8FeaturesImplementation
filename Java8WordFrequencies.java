package com.project.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8WordFrequencies {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Ananas", "Mango", "Banana", "Beer", "Apple", "Mango", "Mango");
		Map<String, List<String>> result = list.stream().sorted().collect(Collectors.groupingBy(i->i.toString()));
		System.out.println(result);
		
		method(list);
	}
	public static void method(List<String> words) {
		Map<String, Long> frequency = words
				.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println();
		System.out.println("frequency = " + frequency);
		
	}
}
