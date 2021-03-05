package com.gsrk.employee.service;

import com.gsrk.employee.model.Employee;

public interface IEmployeeService {
	
	Employee createEmployee(Employee employee);
	
	Employee findEmployeeById(String employeeId);

}
