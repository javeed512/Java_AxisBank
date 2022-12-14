package com.axisbank.atm.service;

public class BankUtil {
	
	
	public static  IBankService  getObject(){
		
		
		return  new BankServiceImp2();
		
		
	}
	
	

}
