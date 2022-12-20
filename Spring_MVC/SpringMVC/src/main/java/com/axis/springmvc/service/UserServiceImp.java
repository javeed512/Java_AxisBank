package com.axis.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.springmvc.beans.User;
import com.axis.springmvc.dao.IUserDao;


@Service
public class UserServiceImp implements IUserService {

		@Autowired
		IUserDao dao;
		
	
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return dao.addUser(user);
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return dao.getUser(username);
	}

}
