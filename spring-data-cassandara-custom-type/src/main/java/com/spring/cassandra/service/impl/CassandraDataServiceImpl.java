package com.spring.cassandra.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cassandra.dao.EmployeeDAO;
import com.spring.cassandra.entity.Employee;
import com.spring.cassandra.service.ICassandraDataService;

/**
 * @author rahulgangarde
 *
 */
@Service
public class CassandraDataServiceImpl implements ICassandraDataService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeDAO.createEmployee(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		return employeeDAO.getEmployee(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDAO.deleteEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	public void createListEmployee(List<Employee> employeelist) {
		employeeDAO.createListEmployee(employeelist);
	}

	@Override
	public void updateListEmployee(List<Employee> employeelist) {
		employeeDAO.updateListEmployee(employeelist);
	}

	@Override
	public void nativeCQLcall() {
		employeeDAO.nativeCQLcall();
	}
}
