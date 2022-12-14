package com.axisbank.atm.ui;

import java.util.Scanner;

import com.axisbank.atm.service.BankUtil;
import com.axisbank.atm.service.IBankService;

public class AtmMachine {

	public static void main(String[] args) {

		IBankService service = BankUtil.getObject();

		Scanner scanner = new Scanner(System.in);

		boolean flag = true;

		System.out.println("*****WELCOME TO AXIS BANK ATM*****");

		while (flag) {

			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Balance Inquiry");
			System.out.println("0.Exit/Logout");

			int key = scanner.nextInt();

			switch (key) {
			case 1:

				// call deposit() service

				System.out.println("Enter Amount to be deposit");

				service.deposit(scanner.nextDouble());
				break;
				
			case 2:

				System.out.println("Enter Amount to be withdraw");

				service.withdraw(scanner.nextDouble());
				
				break;
			case 3:

					service.checkBalance();
				
				break;
			case 4:

				
				flag = false;
				
				System.out.println("Thank you Visit Again!");
				
				break;

			default:
				
				System.err.println("Invalid Input");
				
				break;
			}

		}

	}

}
