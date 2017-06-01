package com.spring.cassandra.service;

import java.util.List;

import com.spring.cassandra.entity.Employee;

/**
 * @author rahulgangarde
 *
 */
public interface ICassandraDataService {
	/**
     * Used to Create the Employee Information
     * @param employee
     */
    public Employee createEmployee(Employee employee);
    /**
     * Used to Create the List of Employee Information
     * @param employee
     */
    public void createListEmployee(List<Employee> employeelist);
    
    /**
     * Getting the Employee Information using Id
     * @param id
     */
    public Employee getEmployee(int id);
    
    /**
     * Used to Update the Employee Information
     * @param employee
     */
    
    public Employee updateEmployee(Employee employee);
    
    /**
     * Used to Update the Employee Information
     * @param employee
     */
    
    public void updateListEmployee(List<Employee> employeelist);
    
    /**
     * Deleting the Employee Information using Id
     * @param id
     */
    public void deleteEmployee(int id);
    
    /**
     * Getting the All Employees information
     * @return
     */
    public List<Employee> getAllEmployees();
    /**
     * This is used for Raw CQL
     */
	public void nativeCQLcall();
}
