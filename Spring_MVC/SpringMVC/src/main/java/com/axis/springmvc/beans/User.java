package com.axis.springmvc.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@ToString

public class User {
	
	private  int userId;
	private String username;
	private String password;
	

}
