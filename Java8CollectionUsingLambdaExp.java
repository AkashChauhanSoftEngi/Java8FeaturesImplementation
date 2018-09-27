package com.project.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComapator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1<o2)?-1:(o1 > o2)?1:0;
	}
}

public class Java8CollectionUsingLambdaExp {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(2);
		l.add(3);
		l.add(8);
		l.add(9);
		List<Integer> m = l;
		List<Integer> n = l;
		
		/*1st Approach*/
		Collections.sort(m, new MyComapator());
		System.out.println(m);

		/*Second Approach*/
		Collections.sort(l, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.intValue() - o2.intValue();

			}
		});
		System.out.println(l);
		
		Comparator<Integer> c = (o1, o2) -> (o1<o2)?-1:(o1 > o2)?1:0;
		Collections.sort(n,c);
		System.out.println(n);
		
		/* Above one can be implemented like this as well */
		Collections.sort(n, (o1, o2) -> (o2 - o1));
		//get output one by one
		n.stream().forEach(System.out::println);
	}
}
