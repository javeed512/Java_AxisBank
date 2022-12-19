package com.axis.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.springcore.dao.EmployeeDAO;

@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeDAO dao;
	
	@Autowired
	String str;
	
	public void getService() {
		
		
		 
		System.out.println(str);
		
		 System.out.println("Service executed and called repo");
		
		 dao.getRepo();
		
	}
	
	
	

}
