package com.BikkadIT.RestfulFirstDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudController {

	@GetMapping(value="/stud",produces = "application/xml")
	public ResponseEntity<List<Student>> getstudent(){
		
		
		Student stu = new Student();
		stu.setSid(1);
		stu.setSname("Rohini");
		stu.setSage(30);
		stu.setSrank(4);
		
		Student stu1 = new Student();
		stu1.setSid(2);
		stu1.setSname("Rakesh");
		stu1.setSage(31);
		stu1.setSrank(2);
		
		Student stu2 = new Student();
		stu2.setSid(3);
		stu2.setSname("Sopan");
		stu2.setSage(30);
		stu2.setSrank(1);
		
		List l = new ArrayList();
		l.add(stu);
		l.add(stu1);
		l.add(stu2);
		
		return new ResponseEntity<List<Student>>(l,HttpStatus.OK);		
	}

}
