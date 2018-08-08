package com.code2night.dao;

import java.util.List;

import com.code2night.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> getEmployees();

	public void saveEmployee(Employee theEmployee);

	public Employee getEmployee(int theId);

	public void deleteEmployee(int theId);
	
}
