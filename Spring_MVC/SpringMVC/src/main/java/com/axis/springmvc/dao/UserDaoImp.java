package com.axis.springmvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.axis.springmvc.beans.User;

@Repository
public class UserDaoImp implements IUserDao {

	@Autowired
	Connection conn;

	PreparedStatement pstmt;

	@Override
	public int addUser(User user) {

		String insertQuery = "insert into user_table(username,password)  values(?,?)";
		int count = 0;
		try {

			pstmt = conn.prepareStatement(insertQuery);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public User getUser(String username) {

		String selectQuery = "select * from user_table where username = ?";

		User user = new User();
		
		try {
			pstmt = conn.prepareStatement(selectQuery);

			pstmt.setString(1, username);

			ResultSet rs = pstmt.executeQuery();

			
			while (rs.next()) {

				user.setUserId(rs.getInt("userId"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;

	}

}
