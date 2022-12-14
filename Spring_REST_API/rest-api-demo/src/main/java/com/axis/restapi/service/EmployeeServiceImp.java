package com.axis.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.axis.restapi.beans.Employee;
import com.axis.restapi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	@Override
	public Employee addEmployee(Employee employee) {  
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public Employee udpateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(long eid) {
		// TODO Auto-generated method stub
		return repo.findById(eid).orElse(null);
	}

	@Override
	public ResponseEntity<String> deleteEmployeeById(long eid) {

				repo.deleteById(eid);
		
		
		return new ResponseEntity<String>("Record Deleted successfully",HttpStatus.OK);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
