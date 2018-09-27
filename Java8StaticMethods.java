package com.project.java.java8;

/*
 * Since 1.8v, interface can contain, static method also but not available directly unless interface name is not being used
 * Interface static method by default not available to implementation class
 * Even if the interface is not implemented, InterfaceName.staticMethod will be accessible
 * Even to add main method inside Interface after 1.8v is allowed
 * General utility methods not required class, interface is enough[cost can be improved]
 * */
interface InterfSample{
	static public void add(int x, int y){
		System.out.println("Addition: " + (x+y));
	}
	
	public static void main(String[] args) {
		InterfSample.add(1, 2);
	}
}

public class Java8StaticMethods{
	public static void main(String[] args) {
		InterfSample.add(1, 2);
	}
}
