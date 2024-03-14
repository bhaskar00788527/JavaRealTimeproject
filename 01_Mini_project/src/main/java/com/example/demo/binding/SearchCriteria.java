package com.example.demo.binding;

public class SearchCriteria {
	
	private String courseName;
	private String enqStatus;
	private String Mode;
	
	
	public SearchCriteria(String courseName, String enqStatus, String mode) {
		super();
		this.courseName = courseName;
		this.enqStatus = enqStatus;
		Mode = mode;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getEnqStatus() {
		return enqStatus;
	}
	public void setEnqStatus(String enqStatus) {
		this.enqStatus = enqStatus;
	}
	public String getMode() {
		return Mode;
	}
	public void setMode(String mode) {
		Mode = mode;
	}
	@Override
	public String toString() {
		return "SearchCriteria [courseName=" + courseName + ", enqStatus=" + enqStatus + ", Mode=" + Mode + "]";
	}
	public Object getClassMode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
		}
	
	


