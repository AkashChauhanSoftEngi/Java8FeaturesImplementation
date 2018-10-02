package com.project.java.java8;

/*
## Constructor reference
* When FI method returns an object
* Object Reference::new
* When: FI method returns an object, reuse existing constructor code and related object
* In case of method having arguments, constructor should also have the same type of arguments.
* Among all constructor, arguments similar with method of FI, constructor will be called
*/

class SamplePlus{
	public SamplePlus(String s) {
		System.out.println("SamplePlus-Object: " + s);
	}
	
	public void printSample(){
		System.out.println("PrintSample!");
	}
}

interface SamplePlusFI{
	public SamplePlus get(String s);
}

public class Java8ConstructorReference {
	public static void main(String[] args) {
		SamplePlusFI i = SamplePlus::new;
		SamplePlus obj = i.get("Akash");
		obj.printSample();
	}
}
