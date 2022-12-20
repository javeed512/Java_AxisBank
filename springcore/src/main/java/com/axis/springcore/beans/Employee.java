package com.axis.springcore.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@NoArgsConstructor
@AllArgsConstructor


@Setter
@Getter*/


@Component("emp")
@Scope("prototype")
public class Employee { // bean or POJO or DTO or Entity

	private long eid;
	private String ename;
	private double salary;

	public Employee() {

	}

	public Employee(long eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
