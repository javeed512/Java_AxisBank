package com.axis.lambdas;

public class Main {

	public static void main(String[] args) {
		
		
		
		MyInterface mi = (int a, int b)->{return a+b;}; // lambda expression
		  
		  int res = mi.add(5, 6);
		  
		  System.out.println(res);
		 
				mi.sayHello();

	}

}
