package com.dw;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dw.entity.ContactsMasterEntity;
import com.dw.repository.ContactsMasterRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		//Save Method
		/*EmployeeRepository bean = ctx.getBean(EmployeeRepository.class);

		System.out.println(bean.getClass().getName());

		Employee employee = new Employee();
		employee.setEmpId(102);
		employee.setEmpName("Pash");
		employee.setEmpSal(700000.00);

		bean.save(employee);*/
		
		ContactsMasterRepository repository =  ctx.getBean(ContactsMasterRepository.class);
		
		/*
		ContactsMasterEntity entity =  new ContactsMasterEntity();
		entity.setContactID(101);
		entity.setContactName("Ware");
		entity.setContactNumber(962308644);
		 
		 repository.save(entity);*/
		
		// SaveAll Method
		/*
		ContactsMasterEntity emp1 = new ContactsMasterEntity(102, "prashan", 999999);
		ContactsMasterEntity emp2 = new ContactsMasterEntity(103, "john", 999999);
		ContactsMasterEntity emp3 = new ContactsMasterEntity(104, "mark", 999999);
		ContactsMasterEntity emp4 = new ContactsMasterEntity(105, "shan", 999999);
		ContactsMasterEntity emp5 = new ContactsMasterEntity(106, "salman", 999999);

		List<ContactsMasterEntity> cList = new ArrayList<>();
		cList.add(emp1);
		cList.add(emp2);
		cList.add(emp3);
		cList.add(emp4);
		cList.add(emp5);

		repository.saveAll(cList);*/
		
		
		// findByID Method
		/*
		Optional<ContactsMasterEntity> findById = repository.findById(110);
		if (findById.isPresent()) {
			System.out.println(findById.get());
		} else {
			System.out.println("Record Not Avaliable");
		}*/
		
		
		// findAllById Method
		/*List<Integer> empIds = new ArrayList<>();
		empIds.add(101);
		empIds.add(102);
		empIds.add(103);
		
		Iterable<ContactsMasterEntity> emps = repository.findAllById(empIds);
		emps.forEach(emp -> {
			System.out.println(emp);
		});*/
		
		
		/*findAll Method
		 Iterable<ContactsMasterEntity> findAll = repository.findAll();
		 findAll.forEach(emp->System.out.println(emp));
		*/
		
		/* coun Methodt
		 long count = repository.count();
		 System.out.println("Total Records Avaliable:: "+ count); */
		
		/* existsById
	   boolean isAvaliable = repository.existsById(101);
	   System.out.println(" Employee Avaliable: "+isAvaliable); */
		
		/* DeleteById
		repository.deleteById(106); */
		
		
		ctx.close();

	}

}
