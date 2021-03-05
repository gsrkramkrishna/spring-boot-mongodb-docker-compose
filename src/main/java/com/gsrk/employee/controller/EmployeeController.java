package com.gsrk.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsrk.employee.model.Employee;
import com.gsrk.employee.service.IEmployeeService;

@RestController
@RequestMapping("/v1")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<Object> saveEmployee(@RequestBody Employee emp){
		
		Employee empResp = employeeService.createEmployee(emp);
		
		return ResponseEntity.ok(empResp);
	}
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<Object> getEmployeeByEmpId(@PathVariable String empId){
		
		Employee empResp = employeeService.findEmployeeById(empId);
		
		return ResponseEntity.ok(empResp);
	}

}
