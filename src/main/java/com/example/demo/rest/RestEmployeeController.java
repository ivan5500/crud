package com.example.demo.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CrudApplication;
import com.example.demo.model.Employee;
import com.example.demo.service.IEmployeeService;

@RestController
public class RestEmployeeController {

	private static Logger LOG = LoggerFactory.getLogger(CrudApplication.class);
	
	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping
	public Employee list(){
		System.out.println("Si entra a listar");
		LOG.info("Si entra a metodo");
		employeeService.get();	
		Employee empl = new Employee("Juan",1,2);
		return empl;	
	}

}
