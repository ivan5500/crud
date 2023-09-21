package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Employee;

public interface IEmployeeService {

	public Employee insert(Employee emp);
	public void delete(int numberEmp);
	public ArrayList<Employee> get();
	public Employee update(Employee name);
}
