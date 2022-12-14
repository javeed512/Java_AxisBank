package com.axis.threads;

public class ThreadDemo2  implements Runnable {

	
	public static void main(String[] args) {
		
			
		Runnable  td = new ThreadDemo2();
		
		
		Thread t = new Thread(td);
		
		System.out.println(t);
				t.start();
		
	}
	
	
	
	@Override
	public void run() {
		
		System.out.println("run()...");
		
		
	}

}
