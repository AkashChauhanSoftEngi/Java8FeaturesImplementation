package com.project.java.java8;

@FunctionalInterface
interface Interf {
	public void m1();
}

class DemoOne implements Interf {

	@Override
	public void m1() {
		System.out.println("Lambda Expression using FI");
	}
}

@FunctionalInterface
interface InterfTwo {
	public void add(int a, int b);
}

class DemoTwo implements InterfTwo {
	@Override
	public void add(int a, int b) {
		System.out.println("Sum: " + (a + b));
	}
}

public class Java8LambdaExpUsingFI {

	public static void main(String[] args) {
		Interf i = new DemoOne();
		i.m1();

		/* Similar to above one */
		Interf j = () -> System.out.println("Lambda Expression using FI");
		j.m1();
		j.m1();
		j.m1();
		j.m1();
		j.m1();
		j.m1();

		InterfTwo k = new DemoTwo();
		k.add(1, 2);

		/* Similar to above one */
		InterfTwo l = (a,b) -> System.out.println("Sum: " + (a + b));
		l.add(1, 2);
	}
}
