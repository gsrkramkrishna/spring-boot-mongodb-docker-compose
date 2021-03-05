package com.gsrk.employee.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.gsrk.employee.model.Employee;
import com.gsrk.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRep;
	
	@Autowired
	private Random random;

	@Override
	public Employee createEmployee(Employee employee) {
		// Generate employee id
		//employee.setEmployeeId(""+1);
		employee.setEmployeeId(random.nextInt()+"");
		Employee empDB = employeeRep.save(employee);
		// TODO Auto-generated method stub
		return empDB;
	}

	@Override
	public Employee findEmployeeById(String employeeId) {
		// TODO Auto-generated method stub
		Optional<Employee> empOpt = employeeRep.findById(employeeId);
		if(!empOpt.isPresent())
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND,employeeId+" not existed");
		return empOpt.get();
	}

}
