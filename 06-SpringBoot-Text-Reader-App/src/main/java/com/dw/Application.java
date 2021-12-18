package com.dw;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dw.beans.CsvReader;
import com.dw.model.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		 ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		CsvReader reader =  context.getBean(CsvReader.class);
		List<Product> filteredData = reader.readAndFilterProductData();
		
		/*
		for (Product product : filteredData) {
			System.out.println(product);
		}*/
		 
		
		filteredData.forEach(System.out::println);
	}

}
