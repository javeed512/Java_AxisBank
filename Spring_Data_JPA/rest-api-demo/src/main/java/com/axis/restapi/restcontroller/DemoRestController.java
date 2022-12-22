package com.axis.restapi.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/demo")
public class DemoRestController {

	
	
		@GetMapping("/hello")
		public String hello() { // no need of response body while using @Restcontroller
			
			return "Hello Friends!";
			
		}
	
		/*  // IMPOSSIBLE
		 * @GetMapping("/home") public String index() {
		 * 
		 * return "index"; // /views/index.jsp
		 * 
		 * }
		 */
		
		
		
	
	
}
