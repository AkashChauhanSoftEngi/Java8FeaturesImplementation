package com.project.java.java8;

import java.util.function.BiConsumer;

public class Java8BiConsumerFI {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> c=(i1,i2)->{System.out.println(i1*i2);};
		c.accept(6, 2);
	}
}
