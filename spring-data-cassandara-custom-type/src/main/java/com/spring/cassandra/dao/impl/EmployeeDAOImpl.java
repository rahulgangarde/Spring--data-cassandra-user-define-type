/**
 * 
 */
package com.spring.cassandra.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.config.CassandraSessionFactoryBean;
import org.springframework.stereotype.Service;

import com.datastax.driver.core.Session;
import com.spring.cassandra.dao.EmployeeDAO;
import com.spring.cassandra.entity.Employee;
import com.spring.cassandra.util.MyCassandraTemplate;

/**
 * @author rahulgangarde
 */
@Service
public class EmployeeDAOImpl implements EmployeeDAO {
    
    @Autowired
    private MyCassandraTemplate myCassandraTemplate;
 
    @Autowired
    private CassandraSessionFactoryBean cassandraSessionFactoryBean;
    
    @Override
    public Employee createEmployee(Employee employee) {  
        return myCassandraTemplate.create(employee);
    }
    
    @Override
    public Employee getEmployee(int id) {       
        return myCassandraTemplate.findById(id, Employee.class);
    }
    
    @Override
    public Employee updateEmployee(Employee employee) {     
        return myCassandraTemplate.update(employee, Employee.class);
    }

    @Override
    public void deleteEmployee(int id) {        
        myCassandraTemplate.deleteById(id, Employee.class);
    }
    @Override
    public List<Employee> getAllEmployees() {       
        return myCassandraTemplate.findAll(Employee.class);
    }

	@Override
	public void  createListEmployee(List<Employee> employeelist) {
		 myCassandraTemplate.createList(employeelist);
	}

	@Override
	public void updateListEmployee(List<Employee> employeeList) {
		myCassandraTemplate.update(employeeList);

	}
	@Override
	public void nativeCQLcall() {
		Session session = cassandraSessionFactoryBean.getObject();
		session.execute("INSERT INTO employee(id, name, age, salary,address_type) VALUES(221, 'NativeCall22', 292, 30002201,{city:'m2umbai',state:'2m1h'})");
	}
	
}
