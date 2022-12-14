package com.axis.demo;

public class ExpDemo {

	public static void main(String[] args) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ExpDemo  ex = new ExpDemo();
		
		
			try{
			int res = ex.div(10, 10);
			
			String name = null;
			
			System.out.println(name.length());

			System.out.println(res);
			}catch (ArithmeticException | NullPointerException e) {
				
					System.err.println("Can't Div number by zero");
					System.err.println("Null value found");
					
					e.printStackTrace();
				
			}
			catch(Exception e) {
				
				System.err.println("something went wrong");
				
			}
			finally {
			
			System.out.println("Machine shutout");
			
			System.out.println("Thank you");
			}
	
	}

	public int div(int a, int b)throws ArithmeticException {
		
		

		return a / b;

	}

}
