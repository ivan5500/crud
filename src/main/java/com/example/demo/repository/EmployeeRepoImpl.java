package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.CrudApplication;
import com.example.demo.model.Employee;

@Repository
public class EmployeeRepoImpl implements IEmployeeRepo{

	private static Logger LOG = LoggerFactory.getLogger(CrudApplication.class);
	private List<Employee> employees = new ArrayList<Employee>();
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
	public List<Employee> get() {
		LOG.info("Listando empleados");
		return employees;
	}

	@Override
	public Employee update(Employee empl) {
		LOG.info("Actualizando empleado");
		for(Employee employee: employees) {
			if (employee.getNumber() == empl.getNumber()){
				employee.setName(empl.getName());
				employee.setNumber(empl.getNumber());
				employee.setAge(empl.getAge());
				break;
			}
		}
		return empl;
	}

}
