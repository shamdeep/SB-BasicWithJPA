package com.dw.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//extends DieselEngin
@Component
public class Car  {

	
	/* 1.  *** Setter Injection***
	IEngin engin;
	
	@Autowired
	public void setEngin(IEngin engin) { //By default bytype IEngin engin
		System.out.println("***** setEng() Called****");
		this.engin = engin;
	}
*/
	
	/* COnstructor Injection
	IEngin engin;

	@Autowired
	public Car(IEngin engin) {
		System.out.println("*****Car :: Constructor******");
		this.engin = engin;
	}
*/
	
	// Field I jnjection
	@Autowired
	private IEngin engin;
	

	public void drive()
	{
		int start = engin.start();
		if(start==0)
		{
			System.out.println("****Journey Started****");
		}
	}
}
