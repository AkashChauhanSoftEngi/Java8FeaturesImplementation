package com.project.java.java8;

import java.util.function.IntConsumer;

public class Java8IntConsumer {
	public static void main(String[] args) {
		IntConsumer c = x->System.out.println(x);
		c.accept(10);
	}
}
