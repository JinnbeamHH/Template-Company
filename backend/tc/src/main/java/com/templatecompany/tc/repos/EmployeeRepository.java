package com.templatecompany.tc.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.templatecompany.tc.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {}