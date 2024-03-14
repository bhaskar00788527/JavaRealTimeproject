package com.bhaskar.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.function.EntityResponse;

import com.bhaskar.demo.repository.Employeerepo;
import com.bhaskar.demo.response.Employeeresponse;

public class Employeeservice{

	@Autowired
	private Employeerepo employeeRepo;

	@Autowired
	private ModelMap mapper;

	public Employeeresponse getEmployeeById(int id) {
		Optional<com.bhaskar.demo.entity.Employee> employee = employeeRepo.findById(id);
		Employeeresponse employeeResponse =  ((Employeerepo) mapper).map(employee);
		return employeeResponse;
	}

}
