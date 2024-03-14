package com.Bhaskar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bhaskar.entity.Plans;

@Repository
public interface PlanRepository extends JpaRepository<Plans, Long> {



}
