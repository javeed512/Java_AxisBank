package com.axis.demo;

public class ThrowDemo {

	public static void main(String[] args) {


		
		//throw new ArithmeticException(); // any exception can be thrown

		
		try {
			
			throw	new UserException("User Exception Occur");
			
			}catch (UserException e) {

					e.printStackTrace();
					System.out.println(e.getMessage());
				
			}
		
	}

}
