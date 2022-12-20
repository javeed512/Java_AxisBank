package com.axis.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.axis.springcore.beans.Employee;
import com.axis.springcore.dao.EmployeeDAO;
import com.axis.springcore.service.EmployeeService;

@Configuration
@ComponentScan("com.axis.springcore")
public class App {

	public static void main(String[] args) {

		// IOC Container
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		EmployeeService service = context.getBean(EmployeeService.class);

		service.getService();

		// IOC Container creating and returning obj

		Employee e1 = context.getBean(Employee.class);

		System.out.println(e1);

		Employee emp = context.getBean("emp", Employee.class);

		System.out.println(emp);

	}

	
		@Bean
		public String  getStringObj() {
			
				
			
				return new String("hello");
			
		}
	
	
		
		@Bean
		public EmployeeDAO  getEmpDao() {
			
				System.out.println("IOC executed this logic then autowired dao obj");
			
				return new EmployeeDAO();
		}
	
	
	
}
