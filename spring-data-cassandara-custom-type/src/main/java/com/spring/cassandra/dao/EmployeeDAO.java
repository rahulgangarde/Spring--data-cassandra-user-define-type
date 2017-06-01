/**
 * 
 */
package com.spring.cassandra.dao;

import java.util.List;

import com.spring.cassandra.entity.Employee;

/**
 * @author rahulgangarde
 *
 */
public interface EmployeeDAO {
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

	public void updateListEmployee(List<Employee> employeeList);

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
	 * This is used for native CQL
	 */
    public void nativeCQLcall();
}
