package com.dw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.entity.InsurancePlan;
import com.dw.repository.InsurancePlanRepository;

@Service
public class InsurancePlanService {

	@Autowired
	private InsurancePlanRepository repository;

	public void savePlan() {

		InsurancePlan plan = new InsurancePlan();
		plan.setPlanId(3);
		plan.setPlanName("SNAP");
		plan.setPlanStatus("DN");

		repository.save(plan);
	}
}
