package com.code2night.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code2night.dao.EmployeeDAO;
import com.code2night.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	// inject customer dao
	@Autowired
	private EmployeeDAO customerDAO;
	
	@Override
	@Transactional
	public List<Employee> getEmployees() {
		return customerDAO.getEmployees();
	}

	@Override
	@Transactional
	public void saveCustomer(Employee theCustomer) {

		customerDAO.saveEmployee(theCustomer);
	}

	@Override
	@Transactional
	public Employee getEmployee(int theId) {
		
		return customerDAO.getEmployee(theId);
	}

	@Override
	@Transactional
	public void deleteEmployee(int theId) {
		
		customerDAO.deleteEmployee(theId);
	}
}





