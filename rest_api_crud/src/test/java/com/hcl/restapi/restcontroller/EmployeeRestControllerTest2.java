package com.hcl.restapi.restcontroller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hcl.restapi.entity.Employee;
import com.mysql.cj.log.Log;

import io.micrometer.core.ipc.http.HttpSender.Response;
import lombok.extern.slf4j.Slf4j;
@Slf4j

@SpringBootTest
class EmployeeRestControllerTest2 {

	@Autowired
	RestTemplate restTemplate;
	
	@Test
	void testAdd() {

			
		Employee data = new Employee(108, "king khan", 45000);
		
	ResponseEntity<Employee> response =	restTemplate.postForEntity("http://localhost:8989/api/employees/add", data, Employee.class);
			
	Employee  e1 =		response.getBody();
	
			log.info("emp from database "+e1);
	
	
	}

	@Test
	void testGetById() {

			long eid = 101;
		
	
	Employee emp =		restTemplate.getForObject("http://localhost:8989/api/employees/get/"+eid,Employee.class);
		
	
		log.debug("data for 101 employee  "+emp);
	
	
	}

}
