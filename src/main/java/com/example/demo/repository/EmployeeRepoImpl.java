package com.example.demo.repository;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.CrudApplication;
import com.example.demo.model.Employee;

@Repository
public class EmployeeRepoImpl implements IEmployeeRepo{

	private static Logger LOG = LoggerFactory.getLogger(CrudApplication.class);
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	@Override
	public Employee insert(Employee emp) {
		LOG.info("Insertando empleado");
		employees.add(emp);
		return emp;
	}

	@Override
	public void delete(int numberEmp) {
		LOG.info("Eliminando empleado");
		for(Employee employee: employees) {
			if (employee.getNumber() == numberEmp){
				employees.remove(employee);
				break;
			}
		}
		
	}

	@Override
	public ArrayList<Employee> get() {
		LOG.info("Listando empleados");
		return employees;
	}

	@Override
	public Employee update(Employee name) {
		LOG.info("Actualizando empleado");
		return null;
	}

}
