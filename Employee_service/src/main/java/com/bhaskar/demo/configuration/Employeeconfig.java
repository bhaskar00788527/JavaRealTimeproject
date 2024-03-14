package com.bhaskar.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

import com.bhaskar.demo.service.Employeeservice;

@Configuration
public class Employeeconfig {

	@Bean
	public Employeeservice employeeBean() {
		return new Employeeservice();
	}

	@Bean
	public ModelMap modelMapperBean() {
		return new ModelMap();
	}

}
