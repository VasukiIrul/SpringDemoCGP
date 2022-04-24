package com.capg.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping
	public ResponseEntity<String> getEmployee()
	{
		return new ResponseEntity<String>("Employee details are here..",HttpStatus.OK);
	}

}
