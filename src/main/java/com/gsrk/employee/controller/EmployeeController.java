package com.gsrk.employee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	
	private Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Value("${employee.service.container.id}")
	private String containerId;
	
	@Autowired
	private IEmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<Object> saveEmployee(@RequestBody Employee emp){
		
		Employee empResp = employeeService.createEmployee(emp);
		logger.info("containerId:"+containerId);
		return ResponseEntity.ok(empResp);
	}
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<Object> getEmployeeByEmpId(@PathVariable int empId){
		
		Employee empResp = employeeService.findEmployeeById(empId);
		logger.info("containerId:"+containerId);
		return ResponseEntity.ok(empResp);
	}
	
	@GetMapping("/employees")
	public ResponseEntity<Object> getAllEmployees(){
		
		List<Employee> empList = employeeService.findAllEmployees();
		logger.info("containerId:"+containerId);
		return ResponseEntity.ok(empList);
	}

}
