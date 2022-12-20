package com.axis.springmvc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.axis.springmvc.service.UserServiceImp;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
	
		
	ConfigurableApplicationContext context =	SpringApplication.run(SpringMvcApplication.class, args);
	
	
				context.getBean(UserServiceImp.class);
	
	
	}

	
	
	
	@Bean
	public  Connection getDBConncetion() {
		Connection conn = null;

		
		FileReader reader = null;
		
		try {
			
			reader = new FileReader("src/main/resources/database.properties");
			
			
			Properties  prop = new Properties();
			
			prop.load(reader);
			
			String driverName =	prop.getProperty("driver.name");
			String url  =	prop.getProperty("url");
			String username =	prop.getProperty("username");
			String password =	prop.getProperty("password");
			
			

			if (conn == null) {

				Class.forName(driverName);
				
				conn = DriverManager.getConnection(url,username,password);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

	
	
	
	
	
	
}
