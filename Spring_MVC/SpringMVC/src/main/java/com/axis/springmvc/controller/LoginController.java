package com.axis.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.axis.springmvc.beans.User;
import com.axis.springmvc.service.IUserService;

@Controller
@RequestMapping("/user")
public class LoginController {

	@Autowired
	IUserService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {

		return "login"; // /views/login.jsp

	}
	
	
	@RequestMapping(value = "/search-page", method = RequestMethod.GET)
	public String searchPage() {
		
		return "search";
		
	}
	
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String addUser(User user) {

		int count = service.addUser(user);

		String msg = null;

		if (count > 0) {

			msg = "User Registered Successfully";

		}

		else {

			msg = "Registration failed !";

		}

		return msg;

	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getUserByName(@RequestParam("username") String username , HttpSession session) {
		
		
		  User user =  service.getUser(username);
		  
		  	session.setAttribute("user", user);
		  
		  	return "search";  //search.jsp

	}

	/*
	 * @RequestMapping(value="/add" , method = RequestMethod.POST)
	 * 
	 * @ResponseBody public String addUser(@RequestParam("uname") String
	 * uname, @RequestParam("pwd") String pwd) {
	 * 
	 * 
	 * 
	 * return "WELCOME  Your Credentials are :"+ uname +" ,  "+pwd;
	 * 
	 * 
	 * }
	 */

	// public String addUser(HttpServletRequest request,HttpServletResponse
	// response,HttpSession session) {

	// String uname = request.getParameter("uname");

	// }

}
