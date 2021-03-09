package com.gsrk.employee.service;

import java.util.List;

import com.gsrk.employee.model.Employee;

public interface IEmployeeService {
	
	Employee createEmployee(Employee employee);
	
	Employee findEmployeeById(int employeeId);
	
	List<Employee> findAllEmployees();

}
