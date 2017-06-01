package com.spring.cassandra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cassandra.entity.Employee;
import com.spring.cassandra.service.ICassandraDataService;

/**
 * @author rahulgangarde
 */
@RestController
public class EmployeeController {
    
    @Autowired
    private ICassandraDataService employeeService;
    
    @RequestMapping(value = "/saveEmployeeData", method = RequestMethod.POST)    
    Employee saveEmployeeData(@RequestBody Employee employee) {        
        return employeeService.createEmployee(employee);
    }
    @RequestMapping(value = "/getEmployeeList", method = RequestMethod.POST)    
    void createList(@RequestBody List<Employee> employeelist) {        
        employeeService.createListEmployee(employeelist);
    }
    @RequestMapping(value = "/employeeNative", method = RequestMethod.POST)    
    void createNativeCQL() {        
        employeeService.nativeCQLcall();
    }
 
    @RequestMapping(value = "/deleteRecord/{id}", method = RequestMethod.DELETE)
    void deleteRecord(@PathVariable("id") int id) {
        employeeService.deleteEmployee(id);
    }
 
    @RequestMapping(value="/getEmployeeList", method = RequestMethod.GET)
    List<Employee> getEmployeeListAll() {
        return employeeService.getAllEmployees();
    }
 
    @RequestMapping(value = "/findEmployeeById/{id}", method = RequestMethod.GET)
    Employee findEmployeeById(@PathVariable("id") int id) {        
        return employeeService.getEmployee(id);
    }
 
    @RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT)
    Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }
    
	@RequestMapping(value = "/updateEmployeeList", method = RequestMethod.PUT)
	void updateList(@RequestBody List<Employee> employeelist) {
		employeeService.updateListEmployee(employeelist);
	}
}