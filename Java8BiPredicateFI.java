package com.project.java.java8;

import java.util.function.BiPredicate;

public class Java8BiPredicateFI {

	public static void main(String[] args) {
		
		/*To check the sum of two numbers is even or not*/
		BiPredicate<Integer,Integer> p1=(i1,i2)->(i1+i2)%2==0?true:false;
		System.out.println("Answer: " + p1.test(1, 1));
		
	}
}
