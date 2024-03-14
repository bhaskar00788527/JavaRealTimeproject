package com.example.demo.Binding;

public class Passenger {
	private String name;
	private String Email;
	private String from;
	private String To;
	private String Doj;
	private String trainNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getDoj() {
		return Doj;
	}
	public void setDoj(String doj) {
		Doj = doj;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public Passenger(String name, String email, String from, String to, String doj, String trainNumber) {
		super();
		this.name = name;
		Email = email;
		this.from = from;
		To = to;
		Doj = doj;
		this.trainNumber = trainNumber;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", Email=" + Email + ", from=" + from + ", To=" + To + ", Doj=" + Doj
				+ ", trainNumber=" + trainNumber + "]";
	}
	
	
	
	

}
