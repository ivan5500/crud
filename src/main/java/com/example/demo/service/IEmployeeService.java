package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface IEmployeeService {

	public Employee insert(Employee emp);
	public void delete(int numberEmp);
	public List<Employee> get();
	public Employee update(Employee emp);
}
