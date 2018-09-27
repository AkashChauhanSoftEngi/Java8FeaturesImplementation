package com.project.java.java8;

import java.util.function.Consumer;

/*
 * Consumer<T>: void accept(T)
 * Accept input, return nothing
 * Just to perform some work on, incoming request
 * */

class Movie{
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
}

public class Java8ConsumerFI {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("Movie Information");
		System.out.println("------------------");
		
		Consumer<Movie> c1=m->System.out.println(m.name + " ready to release");
		Consumer<Movie> c2=m->System.out.println(m.name + " released but flop");
		Consumer<Movie> c3=m->System.out.println(m.name + " Stored into DB");
		Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
		
		cc.accept(new Movie("DDLJ"));
	}
}
