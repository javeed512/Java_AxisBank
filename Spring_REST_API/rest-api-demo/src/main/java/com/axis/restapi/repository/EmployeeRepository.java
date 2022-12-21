package com.axis.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.restapi.beans.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
