package com.dw.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CacheCommandLineRunner implements CommandLineRunner {

	//1.approach using @component
	public CacheCommandLineRunner() {
		System.out.println("***CacheCommandLineRunnner::Constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CC: run() executed **");

	}
}
