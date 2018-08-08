package com.code2night.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.code2night.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	//inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Employee> getEmployees() {
		
		// current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<Employee> theQuery = 
				currentSession.createQuery("from Employee",
											Employee.class);
		
		// execute query and get result list
		List<Employee> employee = theQuery.getResultList();
				
		// return the results		
		return employee;
	}

	@Override
	public void saveEmployee(Employee theEmployee) {

		// current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer
		currentSession.saveOrUpdate(theEmployee);
		
	}

	@Override
	public Employee getEmployee(int theId) {

		// current hibernate session.
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database.
		Employee theEmployee = currentSession.get(Employee.class, theId);
		
		return theEmployee;
	}

	@Override
	public void deleteEmployee(int theId) {

		//current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		
		theQuery.executeUpdate();		
	}

}











