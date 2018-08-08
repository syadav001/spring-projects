package com.code2night.controller;

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

import com.code2night.entity.Employee;
import com.code2night.exception.EmployeeException;
import com.code2night.service.EmployeeService;

@RestController
@RequestMapping("/c2n")
public class EmployeeRestController {
	
	//EmployeeServiceImpl reference.
	@Autowired
	EmployeeService employeeService;
	
	//get employee list
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
			
		return employeeService.getEmployees();
		
	}
	
	//get a particular employee, search by id
	@GetMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable int empId) {
			
		Employee employee = employeeService.getEmployee(empId);
		
		if(employee==null) {
			throw new EmployeeException("Employee not found with id "+empId);
		}
		return employee;
		
	}
	
	//add employee
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee){
		
		theEmployee.setId(0);
		
		employeeService.saveCustomer(theEmployee);
		
		return theEmployee;
		
	}
	
	//update employee
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		employeeService.saveCustomer(employee);
		return employee;
		
	}
	
	//delete employee
	@DeleteMapping("/employees/{empId}")
	public String deleteEmployee(@PathVariable int empId) {
		
		Employee employee = employeeService.getEmployee(empId);
		
		if(employee==null) {
			throw new EmployeeException();
		}else {
			employeeService.deleteEmployee(empId);
		}
		return "Employee deleted with Id "+empId;
		
	}
	
	

}
