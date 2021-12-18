package com.dw;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {// 2.approach implements ApplicationRunner, CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//2.approach
	/*@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ApplicationRunner run() method executed");

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunner run() method executed");
	}*/
	
	//3.approach
	@Bean
	ApplicationRunner apprunner() {
		return apprunner->System.out.println("Application runner run method executed");
	}
	
	@Bean
	CommandLineRunner cr() {
		return cr -> System.out.println("CommandLinerunner run method executed");
	}
}
