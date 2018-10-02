package com.project.java.java8;

import java.util.function.IntPredicate;
/*
 * Predicates Types
 * - IntPredicate
 * - DoublePredicate
 * - LongPredicate
 * 
 * */
public class Java8IntPredicate {

	public static void main(String[] args) {
		IntPredicate p=i->i%2==0?true:false;
		System.out.println(p.test(4));
		System.out.println(p.test(new Integer(5)));
	}
}
