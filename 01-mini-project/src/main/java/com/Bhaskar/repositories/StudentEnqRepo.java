package com.Bhaskar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bhaskar.entities.StudentEnq;

public interface StudentEnqRepo extends JpaRepository<StudentEnq, Integer >
{
    public List<StudentEnq> findByCid(Integer cid);
}
