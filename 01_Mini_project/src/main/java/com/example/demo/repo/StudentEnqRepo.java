 package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Studentenq;


public interface StudentEnqRepo extends JpaRepository<Studentenq, Integer> {

	public List<Studentenq> findByCid(Integer cid);
	
	
	

}
