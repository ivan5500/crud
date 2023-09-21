package com.example.demo.repository;

import java.util.ArrayList;

import com.example.demo.model.Employee;

public interface IEmployeeRepo {
	
	public Employee insert(Employee emp);
	public void delete(Employee emp);
	public ArrayList<Employee> get();
	public Employee update(Employee emp);
 
}
