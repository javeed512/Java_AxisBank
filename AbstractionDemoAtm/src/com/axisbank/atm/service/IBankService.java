package com.axisbank.atm.service;

public interface IBankService {
	
  public static final	String IFSC = "AXIS001";
	
	public abstract void deposit(double amount);
	
	 void withdraw(double amount);
	
	public abstract void checkBalance();
	

}
