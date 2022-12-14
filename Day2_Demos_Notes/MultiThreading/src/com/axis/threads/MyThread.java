package com.axis.threads;

public class MyThread extends Thread{
	
	public MyThread() {
		super(); // Thread();
		
		
	}
	

	public static void main(String[] args) {// main thread


			MyThread  mt1 = new MyThread(); // mythread1
			
				mt1.setName("Child-1");
			
			//System.out.println(mt1);
				
				
		MyThread  mt2 = new MyThread(); // mythread2
				
				mt2.setName("Child-2");
			
			mt1.start();
			mt2.start();
			
			
			/*
			 * for (int i = 0; i < 5; i++) { System.out.println("main"); }
			 */
		
	}
	
	
	public void run() {
		
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(Thread.currentThread().getName());
		}
		
		
	}

}
