package com.axisbank.atm.service;

public abstract class BankServiceImp1 implements IBankService {

	double balance = 500;

	@Override
	public void deposit(double amount) {

		if (amount > 0) {

			balance = balance + amount;

		}

		else {

			System.err.println("Amount can't be less than zero deposit failed");

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
			
			
			System.err.println("Sorry Insufficient Balance");
			
			
		}
		
	}
	
	
	
	public abstract void checkBalance();
	

}
