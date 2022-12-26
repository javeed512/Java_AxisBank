package com.axis.springsecurity.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/v1/security")
public class HelloRestController {
	
	
	
		@GetMapping("/get")
		public String  getMessage() {
			
			
				return "Happy New Year";
			
			
		}
	
	

}
