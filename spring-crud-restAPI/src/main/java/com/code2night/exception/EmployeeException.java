package com.code2night.exception;

public class EmployeeException extends RuntimeException {

	public EmployeeException() {
		super();
		
	}

	public EmployeeException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		
	}

	public EmployeeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public EmployeeException(String message) {
		super(message);
		
	}

	public EmployeeException(Throwable arg0) {
		super(arg0);
		
	}
	
	
	

}
