package com.bhaskar.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhaskar.demo.entity.Employee;
import com.bhaskar.demo.response.Employeeresponse;

public interface Employeerepo extends JpaRepository<Employee, Integer> {

	Employeeresponse map(Optional<Employee> employee);

}
