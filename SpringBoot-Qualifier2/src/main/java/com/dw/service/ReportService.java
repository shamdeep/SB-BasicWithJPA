package com.dw.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dw.bean.IReport;

@Service
public class ReportService {

	private IReport iReport;

	public ReportService(@Qualifier("pdf") IReport iReport) {
		System.out.println(" ****ReportService:: Constructor*****");
		this.iReport = iReport;
	}

	public void generateReport() {
		iReport.generate();
		System.out.println(" Report Generated succsfully");
	}
}
