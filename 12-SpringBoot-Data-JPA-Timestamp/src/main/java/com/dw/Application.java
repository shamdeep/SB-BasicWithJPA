package com.dw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dw.service.InsurancePlanService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		InsurancePlanService service = ctx.getBean(InsurancePlanService.class);
		service.savePlan();
		ctx.close();
	}
}
