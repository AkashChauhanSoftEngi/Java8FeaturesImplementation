package com.project.java.java8;

/*
 * After java 1.8v, we can add any number of default and static methods into an interface
 * To be a FI, at least and at most one SAM, and any number of default and static methods are allowed 
 * Static methods in Interface can only be accessed by interface name not by implementation class name
 * Even to add main method inside Interface after 1.8v is allowed
 * */
@FunctionalInterface
interface InterfaceSample{
	public abstract int add(int x, int y);
	
	/*Dummy Implementation*/
	default void methodOne(){
		System.out.println("Inside Default method, by dummy implementation!");
	}
	/*Dummy Implementation*/
	static void methodTwo(){
		System.out.println("Inside static method!");
	}
}

class Sample implements InterfaceSample{
	
	/*not default, but public*/
	public void methodOne(){
		System.out.println("Inside Default method by Implementation class!");
	}
	
	@Override
	public int add(int x, int y) {
		return (x+y);
	}
	
}

public class Java8NewFeaturesInInterface {

	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.methodOne(); /*Default method of InterfaceSample and Sample both, but overridden one*/
		InterfaceSample.methodTwo(); /*Static method of InterfaceSample interface*/
		System.out.println("After addition: " + obj.add(1, 2));
	}

}
