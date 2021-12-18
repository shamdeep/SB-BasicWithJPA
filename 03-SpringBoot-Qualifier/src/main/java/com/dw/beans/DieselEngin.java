package com.dw.beans;

import org.springframework.stereotype.Component;

@Component("dslEng")
//@Primary
public class DieselEngin implements IEngin {

	public DieselEngin() {
		System.out.println("*****DieselEngin::Constructor");
	}

	@Override
	public int start() {
		System.out.println("*****DE:: Start() method executed ******");
		return 0;
	}

}
