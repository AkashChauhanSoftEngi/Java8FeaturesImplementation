package com.project.java.java8;

import java.util.function.IntFunction;
/*
 * Primitive Functions type
 * - DoubleFunction
 * - DoubleToIntFunction (Input is double, output/return type is int)
 * - DoubleToLongFunction
 * - IntToLongFunction
 * - many others are there
 * */
public class Java8IntFunction {

	public static void main(String[] args) {
		IntFunction<Integer> f = x->x*2;
		System.out.println(f.apply(10));
	}
}
