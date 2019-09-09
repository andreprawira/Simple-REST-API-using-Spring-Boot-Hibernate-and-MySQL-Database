package com.yash.springbootcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.springbootcrudapi.dao.EmployeeDAO;
import com.yash.springbootcrudapi.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	@Override
	public List<Employee> getEmployeeList() {
		return employeeDAO.getEmployeeList();
	}
	@Transactional
	@Override
	public Employee getEmployeebyId(int id) {
		return employeeDAO.getEmployeeInformation(id);
		
	}
	@Transactional
	@Override
	public void saveEmployeeInformation(Employee employee) {
		employeeDAO.saveEmployeeInformation(employee);
		
	}
	@Transactional
	@Override
	public void deleteEmployeeInformation(int id) {
		employeeDAO.deleteEmployeeInformation(id);
		
	}

}
