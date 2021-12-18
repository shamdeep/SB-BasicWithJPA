package com.dw.beans;

import org.springframework.stereotype.Component;

@Component("ptrolEng")
//@Primary
public class PetrolEngin implements IEngin {

	public PetrolEngin() {

		System.out.println("***PetrolEngin:: COnstructor****");
	}

	@Override
	public int start() {
		System.out.println("****** PE::Start() Execution******");
		return 0;
	}

}
