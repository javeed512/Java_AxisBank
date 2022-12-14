package com.axis.threads;

public class ThreadDemo {
	
	
static{ // static
		
		System.out.println("Hello I am first always static block");
		
	}
	
	
	
	{ // instance block
		
		System.out.println("hello am instance..");
		
	}
	
	
	public ThreadDemo() {
		
		super();
		
		System.out.println("object created..");
	}

	public static void main(String[] args) { // Main-Thread or Daemon Thread

			int z;

		System.out.println("Hello from main()");
		
		new ThreadDemo();
		
			add(4,4); 
		
	}
	
	public static int add(int a,int b) { // child thread
		
		int x =0;
		
		System.out.println(x);
		
		return a+b;
		
	}

	

}
