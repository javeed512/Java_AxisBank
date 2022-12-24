package com.axis.springsecurity.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


@Entity
@Table(name="UserAccounts")
public class User {
	
	@Id
	private long userId;
	private String username;
	private String password;
	

}
