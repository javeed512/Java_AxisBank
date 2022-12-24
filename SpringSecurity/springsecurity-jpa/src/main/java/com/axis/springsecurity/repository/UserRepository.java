package com.axis.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.springsecurity.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

	
		public User  findByUsername(String username);
	
	
}
