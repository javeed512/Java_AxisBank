package com.hcl.restapi.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hcl.restapi.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j

@SpringBootTest
class EmployeeServiceImpTest {
	
	
	@Autowired
	IEmployeeService service;
	
	

	@Test
	void testAddEmployee() {
		
		log.info("add test executed...");
		
		Employee emp = new Employee(107, "abhishek", 90000);
		
	Employee e1 =	service.addEmployee(emp);
		
				assertEquals(90000, e1.getSalary());
		
	}

	@Test
	void testGetEmployeeById() {
		
		
		Employee emp =	service.getEmployeeById(105);
			
		
		assertTrue(emp.getSalary() > 5000);
		
		
		log.error("get employee by Id tested..");
			
		
	}

	@Test
	void testGetAllEmployees() {
		
		
		List<Employee> list =		service.getAllEmployees();
		
		log.info(list.toString());
	
				assertNotNull(list);
		
		
	}

	@Test
	void testGetEmployeeBySalary() {
		
	}

}
