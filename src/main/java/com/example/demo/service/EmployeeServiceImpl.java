package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	public IEmployeeRepo employeeRepo;
	@Override
	public Employee insert(Employee emp) {
		return employeeRepo.insert(emp);
	}

	@Override
	public void delete(int numberEmp) {
		employeeRepo.delete(numberEmp);	}

	@Override
	public ArrayList<Employee> get() {
		return employeeRepo.get();
	}

	@Override
	public Employee update(Employee emp) {
		return employeeRepo.update(emp);
	}
	

}
