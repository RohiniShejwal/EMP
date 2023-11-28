package com.BikkadIT.RestfulFirstDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetcontroller")
public class GreetController {

//	@GetMapping("/greet")
//	public String greetmsg() {
//		
//		String mg= "Good Morning";
//		return mg;
//		}
//	
//	@GetMapping("/greet1")
//	public String greetmsg1() {
//		
//		String mg= "Good Evening";
//		return mg;
//		}
//	
//	//Ambiguity problem will be occured if class will be differebt but URL is same
//	
//	@GetMapping("/welcome")
//	public String Welmsg() {
//		
//		String msg="Welcome to Nashik. Good morning";
//		
//		return msg;	
//	}
	
	//Status Code
	
	@GetMapping("/greet")
	public ResponseEntity<String> greetmsg() {
		
		String mg= "Good Morning";
		return new ResponseEntity<String>(mg, HttpStatus.OK);
		}
	
}
