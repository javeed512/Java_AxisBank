package com.axis.restapi.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

@Data  // setter , getter , toString , required args constructor

@Entity
@Table(name="Employee_Table")
public class Employee {
	
	@Id
	private long eid;
	private String ename;
	private double salary;

}
