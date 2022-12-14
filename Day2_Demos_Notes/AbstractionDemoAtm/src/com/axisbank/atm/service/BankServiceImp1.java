package com.axisbank.atm.service;

import com.axisbank.atm.exception.InsufficientBalanceException;
import com.axisbank.atm.exception.NegativeValueException;

public abstract class BankServiceImp1 implements IBankService {

	double balance = 500;

	@Override
	public void deposit(double amount) {

		if (amount > 0) {

			balance = balance + amount;

		}

		else {
			
			try {
			throw new NegativeValueException();
			}
			catch (NegativeValueException e) {

				System.err.println("Negative Value found for amount");
				System.err.println("Amount can't be less than zero deposit failed");
				
			}

			

		}

	}

	@Override
	public void withdraw(double amount) {

		if (balance > 0) {
			if (amount > 0) {

				balance = balance - amount;

			}

			else {

				System.err.println("Amount can't be less than zero withdraw failed");

			}

		}
		
		else {
			
			// throw LowBalanceException();
			
			try {
			throw	new InsufficientBalanceException("You have Insufficient Balance");
			}catch(InsufficientBalanceException e) {
				
				System.err.println("Sorry Insufficient Balance");
				System.err.println(e.getMessage());
				//e.printStackTrace();
				
				
			}
			
			
			
			
			
		}
		
	}
	
	
	
	public abstract void checkBalance();
	

}
