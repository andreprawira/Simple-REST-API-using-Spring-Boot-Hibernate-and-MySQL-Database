package com.yash.springbootcrudapi.dao;

import java.util.List;

import com.yash.springbootcrudapi.model.Employee;

public interface EmployeeDAO {

	List<Employee> getEmployeeList();
	
	Employee getEmployeeInformation(int id);
	
	void saveEmployeeInformation(Employee employee);
	
	void deleteEmployeeInformation(int id);
}
