package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Employee;

public interface IEmployeeRepo {
	
	public Employee insert(Employee emp);
	public void delete(int numberEmp);
	public List<Employee> get();
	public Employee update(Employee empl);
 
}
