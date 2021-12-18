package com.dw.bean;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReport implements IReport {

	public ExcelReport() {
		System.out.println("******** ExcelReort:: Constructor********");
	}

	@Override
	public void generate() {
		System.out.println("***ExcelReport generate method executed ***");

	}

}
