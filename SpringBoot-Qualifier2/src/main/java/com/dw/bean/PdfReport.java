package com.dw.bean;

import org.springframework.stereotype.Component;

@Component("pdf")
//@Primary
public class PdfReport implements IReport {

	public PdfReport() {
		System.out.println("PDF Report:: Constructor");
	}

	@Override
	public void generate() {
		System.out.println(" PDF report generate metion executed");

	}
}
