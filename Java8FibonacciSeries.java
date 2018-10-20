package com.project.java.java8;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class Java8FibonacciSeries {
	static int[] array = new int[10];
	static int k;
	static int prev = 0;
	static int current = 1;
	static int size;
	static DataInputStream input = new DataInputStream(System.in);
	static ConcurrentHashMap<Integer,Long> cache = new ConcurrentHashMap<Integer,Long>();

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		iterative();
		recursive();
		inJava8();
		
	}
	
	static void inJava8() throws NumberFormatException, IOException{
		recursiveInJava8();
	}
	
	@SuppressWarnings("deprecation")
	static void recursiveInJava8() throws NumberFormatException, IOException{
		cache.put(0, 0L);
		cache.put(1, 1L);
		
		System.out.println("enter the no. of terms u want in d series for cache...");
		size = Integer.parseInt(input.readLine());
		IntStream.range(0, size).forEach(value -> fib(value));
		System.out.println("Cache");
		cache.forEach((k,v)->System.out.println(k + ", " +  v));
	}
	
	public static long fib(int n) {
		return cache.computeIfAbsent(n, x -> Math.addExact(fib(x - 1), fib(x - 2)));
		}
	
	
	@SuppressWarnings("deprecation")
	static void iterative() throws NumberFormatException, IOException{
		System.out.println("enter the no. of terms u want in d series...");		
		size = Integer.parseInt(input.readLine());
		
		int prev = 0;
		int current = 1;
		int next = prev + current;
		int[] array = new int[size];
		
		for(int j=0;j<size;j++){
			array[j] = next;
			prev = current;
			current = next;
			next = prev + current;
		}
		System.out.println(Arrays.toString(array));
		
	}
	
	static void recursive(){
		
		recursion();
		System.out.println(Arrays.toString(array));
		
	}
	
	static void recursion(){
		if(k<size){
			array[k] = prev + current;
			prev = current;
			current = array[k];
			k++;
			recursion();
		}
	}
}
