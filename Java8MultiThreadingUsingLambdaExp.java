package com.project.java.java8;

class MyInterface implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("Child Thread: " + i);
		}
	}
}

public class Java8MultiThreadingUsingLambdaExp {

	public static void main(String[] args) {
		Runnable i = ()->{for (int k=0; k<10; k++) {
			System.out.println("Child Thread1: " + k);
		}};
		Thread t1 = new Thread(i);
		t1.start();
		
		Thread t2 = new Thread (()->{for (int k=0; k<10; k++) {
			System.out.println("Child Thread2: " + k);
		}});
		t2.start();
		
		for (int j=0; j<10; j++) {
			System.out.println("Main Thread: " + j);
		}
	}
}
