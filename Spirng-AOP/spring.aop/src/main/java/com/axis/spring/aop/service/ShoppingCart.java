package com.axis.spring.aop.service;

import org.springframework.stereotype.Service;

@Service
public class ShoppingCart { // business serviec
	
	
	
	public void login() {
		
			
			System.out.println("User Login Success..");
		
	}
	
	
	
	public void checkout(String bookingStatus) {
		
		// login
		// authentication , authorization
		// logger
		
		
		System.out.println("Checkout method from ShoppingCart");
		System.out.println("your booking status is : "+bookingStatus);
		
	}
	
	
	public void addProduct() {
		
		System.out.println("product added by customer to cart");
		
	}
	
	public  void removeProduct() {
		
		System.out.println("product remove by customer from cart");
		
		
		
	}
	
	
	public int  quantity(int num) {
		
		
		
		if(num == 0)
		{
			
			
		
			throw new NullPointerException();
			
			
		}
		return num;
		
	}
	
	
	

}
