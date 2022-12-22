package com.axis.restapi.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.axis.restapi.beans.Employee;

public interface IEmployeeService {
	
	
	
		public  Employee  addEmployee(Employee employee);
		public  Employee  udpateEmployee(Employee employee);
		
		public Employee   getEmployeeById(long eid);
		
		public  ResponseEntity<String>  deleteEmployeeById(long eid); 
		
		public   List<Employee>   getAllEmployees();
		
		
		public List<Employee>  getByEname(String ename);
		
		
		public List<Employee>  getBySalaryGT(double salary);
		
		
		List<Employee>		getByOrderBySalaryAsc();
		
		
		List<Employee>		getBySalaryRange(double low, double high);
	
	

}
