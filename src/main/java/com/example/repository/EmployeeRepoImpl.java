package com.example.repository;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.CrudApplication;
import com.example.model.Employee;

@Repository
public class EmployeeRepoImpl implements IEmployeeRepo{

	private static Logger LOG = LoggerFactory.getLogger(CrudApplication.class);
	
	@Override
	public Employee insert(Employee emp) {
		LOG.info("Insertando empleado");
		return null;
	}

	@Override
	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Employee> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(Employee name) {
		// TODO Auto-generated method stub
		return null;
	}

}
