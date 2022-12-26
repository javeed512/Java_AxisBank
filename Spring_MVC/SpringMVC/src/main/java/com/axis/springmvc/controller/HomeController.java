package com.axis.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody // only for text or data
	public String hello() {

		return "Hello Friends!";

	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)

	public String getView() {

		return "success"; // page-name /views/success.jsp

	}

	@RequestMapping(value = "/data", method = RequestMethod.GET)
	@ResponseBody
	public List getData() {

		List<String> list = new ArrayList<String>();

		list.add("Tom");
		list.add("smith");
		list.add("ford");

		return list;

	}
	
	
	@RequestMapping(value = "/modelview", method = RequestMethod.GET)
	public ModelAndView  getModelView() {
		
		
			ModelAndView modelView = new ModelAndView();
			
			
				modelView.setViewName("index");
				
				modelView.addObject("username", "javeed");
				modelView.addObject("password", new String("tiger"));
				
			return modelView;
		
	}
	
	
	
	

}
