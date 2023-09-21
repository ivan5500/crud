package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class RestEmployeeController {


	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping
	public List<Employee> list(){
		return employeeService.get();	
	}
	@PostMapping
	public Employee insert(@RequestBody Employee empl) {
		return employeeService.insert(empl);
	}
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Integer numEmployee) {
		employeeService.delete(numEmployee);
	}
	
	@PutMapping
	public Employee update(@RequestBody Employee empl) {
		return employeeService.update(empl);		
	}

}
