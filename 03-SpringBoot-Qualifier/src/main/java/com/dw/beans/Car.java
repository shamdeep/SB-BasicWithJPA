package com.dw.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//extends DieselEngin
@Component
public class Car {

	@Autowired
	@Qualifier("ptrolEng")
	private IEngin engin;

	public void drive() {
		System.out.println(engin.getClass().getName());
		int start = engin.start();
		if (start == 0) {
			System.out.println("****Journey Started****");
		}
	}
}
