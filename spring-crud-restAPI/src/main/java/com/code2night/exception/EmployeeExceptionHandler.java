package com.code2night.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {
	
	//exception handler for not found type error.
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeException employeeExc){
		
		EmployeeErrorResponse error = new EmployeeErrorResponse(
				HttpStatus.NOT_FOUND.value(),employeeExc.getMessage(),
				System.currentTimeMillis());
			
		return new ResponseEntity<EmployeeErrorResponse>(error,HttpStatus.NOT_FOUND);
		
	}
	
	//for all other exception types.
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException(Exception exc){
		
		EmployeeErrorResponse error = new EmployeeErrorResponse(
				HttpStatus.BAD_REQUEST.value(),"Invalid employee id (Id should be in integer)",
				System.currentTimeMillis());
			
		return new ResponseEntity<EmployeeErrorResponse>(error,HttpStatus.BAD_REQUEST);
		
	}

}
