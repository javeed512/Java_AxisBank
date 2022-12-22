package com.axis.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.axis.restapi.beans.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

	
			List<Employee>	findByEname(String ename);
			
			List<Employee>  findBySalaryGreaterThan(double salary);  // select * from employee_table where salary > ?;
	
	
	// List<Employee>  findBySalaryLessThan(double salary);   // select * from employee_table where salary < ?;
			
			
	List<Employee>		findByOrderBySalaryAsc();  // select * from employee_table order by salary asc;
			

								//select * from employee_table where salary between ? and ? order by salary desc;
	
				@Query("select e from Employee e where e.salary between ?1  and  ?2 order by e.salary desc")
				List<Employee>		findBySalaryRange(double low, double high);
	
	
	
}
