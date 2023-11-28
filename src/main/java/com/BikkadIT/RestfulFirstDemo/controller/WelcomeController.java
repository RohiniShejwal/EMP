package com.BikkadIT.RestfulFirstDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/welcomecontroller")
//public class WelcomeController {
//
//	@GetMapping("/welcome")
//	public String Welmsg() {
//		
//		String msg="Welcome to Nashik";
//		
//		return msg;	
//	}
	
	
	//Ambiguity problem due to same URL

 //	@GetMapping("/welcome1")
//	public String Welmsg1() {
//		
//		String msg="Welcome to Nashik city";
//		
//		return msg;	
//	}
//	
//	@GetMapping("/greet")
//	public String greetmsg() {
//		
//		String mg= "Good Morning All ";
//		return mg;
//		}

	
	// StatusCode
	
	@RestController
	@RequestMapping("/welcomecontroller")
	public class WelcomeController {

		@GetMapping("/welcome")
		public ResponseEntity<String> Welmsg() {
			//int a=10/0;
			
			String msg="Welcome to Nashik";
			
			return new ResponseEntity<String>(msg, HttpStatus.OK);	
		}

}
