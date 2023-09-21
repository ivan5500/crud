package com.example.repository;

import java.util.ArrayList;

import com.example.model.Employee;

public interface IEmployeeRepo {
	
	public Employee insert(Employee emp);
	public void delete(Employee emp);
	public ArrayList<Employee> get();
	public Employee update(Employee emp);
 
}
