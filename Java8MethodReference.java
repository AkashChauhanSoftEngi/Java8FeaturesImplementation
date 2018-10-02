package com.project.java.java8;

/*
 * To reuse already existing implemented code as FI implementations {Code reuse-ability}
 * Alternative to lembda expression
 * For static methods
   - class name::method name
 * For non static methods
   - Object reference::method name
 * It does not matter if return type or access modifier are different but arguments should be same and same types
 * 
 * */
public class Java8MethodReference {

	public static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child1-Thread");
		}
	}
	public void m2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child2-Thread");
		}
	}

	public static void main(String[] args) {

		/* FI = ClassName::MethodName */
		Runnable r = Java8MethodReference::m1;
		Thread t = new Thread(r);
		t.start();
		
		Java8MethodReference obj = new Java8MethodReference();
		Runnable q = obj::m2;
		Thread u = new Thread(q);
		u.start();
		
		/*Another way to reuse existing code*/
		SampleFI i = Java8MethodReference::sum;
		i.add(1, 2);

	}
	
	private static int sum(int x, int y){
		System.out.println("Sum: " + (x+y));
		return 10;
	}
}

interface SampleFI{
	public void add(int x, int y);
}