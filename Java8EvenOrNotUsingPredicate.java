package com.project.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8EvenOrNotUsingPredicate {

	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0?true:false;
		System.out.println(p.test(4));
		System.out.println(p.test(5));
		
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
}
