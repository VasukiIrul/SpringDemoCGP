package com.capg.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping("/getEmployee")
	public ResponseEntity<String> getEmployee()
	{
		return new ResponseEntity<String>("Employee details are here..",HttpStatus.OK);
		
	}
	@GetMapping("welcome/{name}")
	
	public ResponseEntity<String> getEmployee(@PathVariable("name")String name)
	{
		return new ResponseEntity<String>("welcome "+name,HttpStatus.OK);
		
	}

}
