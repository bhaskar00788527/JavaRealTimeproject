package com.Bhaskar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bhaskar.entity.Plans;
import com.Bhaskar.service.PlanService;

@RestController
@RequestMapping("/api/plans")
public class PlansController {
	
    @Autowired
    private PlanService planService;

    @GetMapping
    public List<Plans> getAllPlans() {
        return planService.getAllPlans();
    }

    @GetMapping("/{id}")
    public Plans getPlanById(@PathVariable Long id) {
        return planService.getById(id);
    }

    @PostMapping
    public Plans save(@RequestBody Plans plan) {
        return planService.save(plan);
    }

    @PutMapping("/{id}")
    public Plans updatePlan(@PathVariable Long id, @RequestBody Plans planDetails) {
        return planService.updatePlan(id, planDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePlan(@PathVariable Long id) {
        planService.deletePlans(id);
    }
}