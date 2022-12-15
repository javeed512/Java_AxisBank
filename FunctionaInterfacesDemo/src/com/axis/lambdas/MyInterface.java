package com.axis.lambdas;

@FunctionalInterface
public interface MyInterface {

		
		public int add(int a, int b);
	
		public default  void sayHello() {
			
			System.out.println("from interface");
			
		}
	
	
}
