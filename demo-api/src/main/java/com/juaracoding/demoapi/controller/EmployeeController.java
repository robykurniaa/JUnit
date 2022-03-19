package com.juaracoding.demoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.demoapi.model.Employee;
import com.juaracoding.demoapi.model.Employee;
import com.juaracoding.demoapi.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private final EmployeeRepository employeeRepository;
	
	EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@GetMapping("/employee")
	public List<Employee> all(){
		
		return employeeRepository.findAll();
			
	}
	
	@PostMapping("/employee")	
	Employee newEmployee(@RequestBody Employee newEmployee) {
		return employeeRepository.save(newEmployee);
		
	}
}
