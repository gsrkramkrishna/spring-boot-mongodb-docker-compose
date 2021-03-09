package com.gsrk.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gsrk.employee.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
	
}
