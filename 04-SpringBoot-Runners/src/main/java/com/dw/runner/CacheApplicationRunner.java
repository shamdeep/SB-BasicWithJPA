package com.dw.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CacheApplicationRunner implements ApplicationRunner {

	//1.approach using @component
	public CacheApplicationRunner() {
		System.out.println("******* CacheApplciationRunner::Constructor");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(" *** Application run() method executed*******");

	}
}
