package com.project.java.java8;

public class Java8LambdaExpVsAnonymousInnerClass {

	public static void main(String[] args) {
		/* No-name of the Implementation Class: Anonymous Inner Class */
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + ": " + i);
				}
			}
		};
		/* Can be modified like this as well */
		Runnable s = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		};

		Thread t1 = new Thread(r, "T1");
		t1.start();

		Thread t2 = new Thread(s, "T2");
		t2.start();
		
		/*Another very effective way of writing Thread Implementation class*/
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		}, "T3");
		t3.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}
