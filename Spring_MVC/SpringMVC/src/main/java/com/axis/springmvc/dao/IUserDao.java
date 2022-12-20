package com.axis.springmvc.dao;

import com.axis.springmvc.beans.User;

public interface IUserDao {

	public int addUser(User user);

	public User getUser(String username);

}
