package com.dw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dw.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public List<Employee> findByEmpName(String name);

	public List<Employee> findByEmpSal(Double empsalary);

	public List<Employee> findByEmpNameAndEmpSal(String name, Double sal);

	public List<Employee> findByEmpSalGreaterThan(Double sal);

	public List<Employee> findByEmpNameIn(List<String> names);

	// Custom Queries with HQl
	@Query("Select empSal from Employee where empName =:name")
	public Double findByEmpSalaryByName(String name);

	// Custom Queries with nativeQuery/Sql Query
	@Query(value = "Select count(*) from EMP_TBL", nativeQuery = true)
	public Integer getTableCount();
}
