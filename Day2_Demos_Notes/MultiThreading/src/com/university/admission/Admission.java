package com.university.admission;

public class Admission implements Runnable {

	static int seats = 1;

	public static void main(String[] args) {

		Admission ad = new Admission();

		Thread student1 = new Thread(ad);

		student1.setName("Raju"); // 5

		Thread student2 = new Thread(ad);

		student2.setName("Satish"); // 5
		System.out.println("Welcome to Admissions");
		System.out.println("No. of seats Before " + seats);
		
		
		student1.start();
		student2.start();

		

	}

	@Override
	public synchronized void run() {

		if (seats > 0) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			System.out.println("Seat Allocated to " + Thread.currentThread().getName());

			seats = seats -1;
			
			System.out.println("No. of seats left "+seats);
		
		} else {

			System.err.println("Better try next year "+ Thread.currentThread().getName());
		}

	}

}
