package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Counsellor;

public interface CounsellorRepo extends JpaRepository<Counsellor, Integer> {

	public Counsellor findByEmail(String email);
	
	public Counsellor findByEmailAndPassword(String email,String password);

}
