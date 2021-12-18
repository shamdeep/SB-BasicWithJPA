package com.dw.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.entity.Address;
import com.dw.entity.Employee;
import com.dw.repository.AddressRepository;
import com.dw.repository.EmployeeRepository;

@Service
public class EmpoyeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	AddressRepository addressRepository;

	@Transactional(rollbackOn = Exception.class)
	public void saveData() {

		Employee employee = new Employee();
		employee.setEmpId(205);
		employee.setEmpName("Ketan");
		employee.setEmpSal(470000.00);
		employeeRepository.save(employee);

		// int i = 10 / 0;

		Address address = new Address();
		address.setAddrsId(503);
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setEmpId(205);
		addressRepository.save(address);

	}
}
