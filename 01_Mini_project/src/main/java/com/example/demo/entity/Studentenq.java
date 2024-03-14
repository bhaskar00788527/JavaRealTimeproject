package com.example.demo.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Studentenq1")
public class Studentenq {
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer enqId;
	private String name;
	private long phno;
	private String classmode;
	private String coursename;
	private String enqstatus;
	@CreationTimestamp
	private LocalDate createdDate;
	private Integer cid;
	
	public Integer getEnqId() {
		return enqId;
	}
	public void setEnqId(Integer enqId) {
		this.enqId = enqId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getClassmode() {
		return classmode;
	}
	public void setClassmode(String classmode) {
		this.classmode = classmode;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getEnqstatus() {
		return enqstatus;
	}
	public void setEnqstatus(String enqstatus) {
		this.enqstatus = enqstatus;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public Studentenq(Integer enqId, String name, long phno, String classmode, String coursename, String enqstatus,
			LocalDate createdDate, Integer cid) {
		super();
		this.enqId = enqId;
		this.name = name;
		this.phno = phno;
		this.classmode = classmode;
		this.coursename = coursename;
		this.enqstatus = enqstatus;
		this.createdDate = createdDate;
		this.cid = cid;
	}
	public Studentenq() {
		// TODO Auto-generated constructor stub
	}
	public void setCid(Integer cid2) {
		// TODO Auto-generated method stub
		
	}
	public void setClassMode(Object classMode2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
