package com.code2night.service;

import java.util.List;

import com.code2night.entity.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();

	public void saveCustomer(Employee theEmployee);

	public Employee getEmployee(int theId);

	public void deleteEmployee(int theId);
	
}
