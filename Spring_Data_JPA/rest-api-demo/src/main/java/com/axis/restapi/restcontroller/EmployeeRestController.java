package com.axis.restapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.restapi.beans.Employee;
import com.axis.restapi.service.EmployeeServiceImp;
import com.axis.restapi.service.IEmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeRestController {
	
	
		@Autowired
		IEmployeeService service;
	
	
		@PostMapping("/add")
		public Employee  add(@RequestBody Employee emp) {
			
			// input validation
			
				boolean isValid =	EmployeeServiceImp.isValidEmployeeData(emp);
			
			// add service
			
				Employee employee = null;
				
				if(isValid) {
					
					employee = service.addEmployee(emp);
					
				}
				
				
				
				
			return employee;
			
		}
	
		
		
		@PutMapping("/update")
		public Employee  update(@RequestBody  Employee emp) {
			
			
			// update service
			
				boolean isValid =	EmployeeServiceImp.isValidEmployeeData(emp);
			
			
			
				Employee employee = null;
				
				if(isValid) {
					
					employee = service.udpateEmployee(emp);
					
				}
				
				
				
				
			return employee;
			
		}
		
		
		@GetMapping("/get/{eid}")
		public Employee  getById(@PathVariable  long eid) {
			
			
				return  service.getEmployeeById(eid);
			
			
		}
		
		
		
		@DeleteMapping("/delete/{eid}")
		public  ResponseEntity<String>  deleteById(@PathVariable  long eid) {
			
			
				return  service.deleteEmployeeById(eid);
			
			
		}
		
	
		@GetMapping("/get")
		public List<Employee>  getAll() {
			
			
			return service.getAllEmployees();
			
			
		}
		

		@GetMapping("/get/ename/{ename}")
		public List<Employee>  getByEname(@PathVariable  String ename) {
			
			
			return service.getByEname(ename);
			
			
		}
		
		
		@GetMapping("/get/salary-gt/{salary}")
		public List<Employee>  getBySalaryGT(@PathVariable  double salary) {
			
			
			return service.getBySalaryGT(salary);
			
			
		}
		
		
		
		@GetMapping("/get/orderby-salary")
		public List<Employee>  getOrderBySalary() {
			
			
			return service.getByOrderBySalaryAsc();
			
			
		}
		
		
		@GetMapping("/get/salary-range/{low}/{high}")
		public List<Employee>  getSalaryRange(@PathVariable double low , @PathVariable double high) {
			
			
			return service.getBySalaryRange(low, high);
			
		}
		
		
	
	

}
