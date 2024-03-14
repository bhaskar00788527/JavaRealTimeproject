package com.Bhaskar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bhaskar.entity.Plans;
import com.Bhaskar.repository.PlanRepository;

@Service
public class PlansServiceImpl implements PlanService{
	
	@Autowired
	private PlanRepository plansRepository;

	@Override
	public Plans save(Plans plans) {
		Plans plan=plansRepository.save(plans);
		return plan;
	}

	@Override
	public Plans getById(Long id) {
		return plansRepository.findById(id).orElse(null);
	
	}

	@Override
	public List<Plans> getAllPlans() {
		
		return plansRepository.findAll();
	
	}
	  public Plans updatePlan(Long id, Plans planDetails) {
	        Plans plan = plansRepository.findById(id).orElse(null);
	        if (plan != null) {
	            plan.setPlanName(planDetails.getPlanName());
	            plan.setPlanStatus(planDetails.getPlanStatus());
	            plan.setStartDate(planDetails.getStartDate());
	            plan.setEndDate(planDetails.getEndDate());
	            return plansRepository.save(plan);
	        }
	        return null;
	    }

	    public void deletePlan(Long id) {
	        plansRepository.deleteById(id);
	    }

		@Override
		public Plans updateplan(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deletePlans(Long id) {
			// TODO Auto-generated method stub
			
		}
	}

		
		
	
