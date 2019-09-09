package com.yash.springbootcrudapi.service;

import java.util.List;

import com.yash.springbootcrudapi.model.Employee;

public interface EmployeeService {

	List<Employee> getEmployeeList();
	
	Employee getEmployeebyId(int id);
	
	void saveEmployeeInformation(Employee employee);
	
	void deleteEmployeeInformation(int id);
}
