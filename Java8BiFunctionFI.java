package com.project.java.java8;

import java.util.function.BiFunction;

public class Java8BiFunctionFI {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> f1 = (i1,i2)->i1*i2;
		System.out.println("Multiplication: " + f1.apply(2, 3));
	}

}
