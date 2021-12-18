package com.dw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dw.service.ReportService;

@SpringBootApplication
public class SpringBootQualifier2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(SpringBootQualifier2Application.class, args);

		ReportService reportService = cxt.getBean(ReportService.class);
		reportService.generateReport();

	}

}
