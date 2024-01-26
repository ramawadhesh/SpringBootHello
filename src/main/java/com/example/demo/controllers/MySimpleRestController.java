package com.example.demo.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySimpleRestController {
	private Date d = new Date();
	@GetMapping("/rest/employee/get/{id}")
	public String getEmployeeByID(@PathVariable("id") int id) {
		
		return d+" :The "+id+" is not present in our database. You try after sometime"; 
	}
	
}


