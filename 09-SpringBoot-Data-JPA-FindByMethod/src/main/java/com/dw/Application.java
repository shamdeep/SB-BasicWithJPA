package com.dw;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.repository.support.Repositories;

import com.dw.entity.Employee;
import com.dw.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		EmployeeRepository repository = ctx.getBean(EmployeeRepository.class);
		//ContactsMasterRepository repository = ctx.getBean(ContactsMasterRepository.class);

		/* findByContactName Method
		ContactsMasterEntity entity = repository.findByContactName("Ware");
		System.out.println(entity); */
		
		/* 1.findByEmpName
		Employee findByName = repository.findByEmpName("Deepak");
		System.out.println(findByName); */
		
		
		/*
		 * List<Employee> findByEmpSal = repository.findByEmpSal(550000.00);
		 * findByEmpSal.forEach(System.out::println);
		 */
		
		
		/*
		 * List<Employee> findByEmpNameAndEmpSal =
		 * repository.findByEmpNameAndEmpSal("Deepak",56000.00);
		 * System.out.println(findByEmpNameAndEmpSal);
		 */
		
		
		/*List<Employee> greaterThanSal =  repository.findByEmpSalGreaterThan(50000.00);
		greaterThanSal.forEach(emp->{
			System.out.println(emp);
		});*/
		
		
		
		List<Employee> empList = repository.findByEmpNameIn(Arrays.asList("Deepak", "pash"));
		empList.forEach(emp -> {
			System.out.println(emp);
		});
		
		
		//Customer query with HQl internally it will convert into sql
		Double empSalary = repository.findByEmpSalaryByName("Deepak");
		System.out.println("Employee Salary: "+empSalary);

	Integer countResult = repository.getTableCount();
	System.out.println("Count "+countResult);

	}

}
