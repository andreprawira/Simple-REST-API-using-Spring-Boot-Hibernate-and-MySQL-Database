package com.yash.springbootcrudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.springbootcrudapi.model.Employee;
import com.yash.springbootcrudapi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> get() {
		return employeeService.getEmployeeList();
	}
	
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee employee) {
		employeeService.saveEmployeeInformation(employee);
		return employee;
	}
	
	// we added {id} to input the requested employee id
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Employee employeeObj = employeeService.getEmployeebyId(id);
		if (employeeObj == null) {
			throw new RuntimeException("Employee "+ id + " does not exist");
		}
		return employeeObj;
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		employeeService.deleteEmployeeInformation(id);
		return "Employee " + id + " has been deleted";
	}
	
	@PutMapping("/employee")
	public Employee update(@RequestBody Employee employeeObj) {
		employeeService.saveEmployeeInformation(employeeObj);
		return employeeObj;
	}
}
