package com.Bhaskar.entity;

public class SsaWebRequest {

	private String Name;
	private String Dob;
	private Long Ssn;
	
	public String getStateName() {
		return Name;
	}
	public void setStateName(String stateName) {
		this.Name = stateName;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		this.Dob = dob;
	}
	public Long getSsn() {
		return Ssn;
	}
	public void setSsn(Long ssn) {
		this.Ssn = ssn;
	}
	
	
}
