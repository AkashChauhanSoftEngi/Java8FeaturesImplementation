package com.project.java.java8;

import java.util.function.Function;

public class Java8SquareUsingFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i * i;
		System.out.println("Square of 4:" + f.apply(4));
		System.out.println("Square of 5:" + f.apply(5));
		System.out.println("akash");
	}

}
