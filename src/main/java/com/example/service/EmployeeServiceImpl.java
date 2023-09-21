package com.example.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	public IEmployeeRepo employeeRepo;
	@Override
	public Employee insert(Employee emp) {
		return null;
	}

	@Override
	public void delete(Employee emp) {
		employeeRepo.delete(emp);	}

	@Override
	public ArrayList<Employee> get() {
		return employeeRepo.get();
	}

	@Override
	public Employee update(Employee emp) {
		return employeeRepo.update(emp);
	}
	

}
