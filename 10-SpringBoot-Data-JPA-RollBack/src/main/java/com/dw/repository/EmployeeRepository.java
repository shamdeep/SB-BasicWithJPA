package com.dw.repository;

import org.springframework.data.repository.CrudRepository;

import com.dw.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	
}
