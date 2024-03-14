package com.Bhaskar.service;

import java.util.List;

import com.Bhaskar.entity.Plans;


public interface PlanService {
	
	public Plans save(Plans plans);
	
	public Plans getById(Long id);
	
	public List<Plans> getAllPlans();
	
	public Plans updateplan(Long id);
	
	public void deletePlans(Long id);

	public Plans updatePlan(Long id, Plans planDetails);

}
