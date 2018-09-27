package com.project.java.java8;

import java.util.Date;
import java.util.function.Supplier;

/*
 * No input, but return the output.
 * To perform certain task and return your work/result at the end
 * */

public class Java8SupplierFI {

	public static void main(String[] args) {
		Supplier<String> s1=()->"OTP Service";
		System.out.println(s1.get());
		
		Supplier<Date> s2 = ()->new Date();
		System.out.println(s2.get());
		
		Supplier<String> s3 = ()->{
			String otp="";
			for (int i=0;i<6;i++){
				otp = otp+(int) (Math.random()*10);
			}
			return otp;
		};
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
		System.out.println(s3.get());
	}
}
