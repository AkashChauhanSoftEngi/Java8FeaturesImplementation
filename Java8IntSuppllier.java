package com.project.java.java8;

import java.util.function.IntSupplier;

public class Java8IntSuppllier {

	public static void main(String[] args) {
		IntSupplier s=()->2;
		System.out.println(s.getAsInt());
	}
}
