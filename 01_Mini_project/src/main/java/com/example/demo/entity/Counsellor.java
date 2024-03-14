package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="Counsellor1")
public class Counsellor {
	@jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer cid;
	private String name;
	private String email;
	private String password;
	private Long phno;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Counsellor [cid=" + cid + ", name=" + name + ", email=" + email + ", password=" + password + ", phno="
				+ phno + "]";
	}
	
	
	
	
	

}
