package com.dw.beans;

import org.springframework.stereotype.Component;

@Component
public class DieselEngin implements IEngin {

	public DieselEngin() {
		System.out.println("*****DieselEngin::Constructor");
	}

	@Override
	public int start() {
		System.out.println("***** Start() method executed ******");
		return 0;
	}

}
