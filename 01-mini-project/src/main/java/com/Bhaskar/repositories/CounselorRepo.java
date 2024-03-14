package com.Bhaskar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bhaskar.entities.Counselor;

public interface CounselorRepo extends JpaRepository<Counselor, Integer>
{
    public Counselor findByEmail(String email);
	public Counselor findByEmailAndPwd(String email,String pwd);
}
