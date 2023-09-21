package com.example.service;

import java.util.ArrayList;

import com.example.model.Employee;

public interface IEmployeeService {

	public Employee insert(Employee emp);
	public void delete(Employee emp);
	public ArrayList<Employee> get();
	public Employee update(Employee name);
}
