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
import com.axis.restapi.service.IEmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeRestController {
	
	
		@Autowired
		IEmployeeService service;
	
	
		@PostMapping("/add")
		public Employee  add(@RequestBody Employee emp) {
			
			
			// add service
			
			return service.addEmployee(emp);
			
		}
	
		
		
		@PutMapping("/update")
		public Employee  update(@RequestBody  Employee emp) {
			
			
			// update service
			
			return service.udpateEmployee(emp);
			
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
		
		
		
	
	

}
