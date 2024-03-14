package com.example.demo.Binding;

public class Ticket {

	private int Ticketnumber;
	private String name;
	private String Email;
	private String from;
	private String to;
	private String doj;
	private String trainNumber;
	public int getTicketnumber() {
		return Ticketnumber;
	}
	public void setTicketnumber(int ticketnumber) {
		Ticketnumber = ticketnumber;
	}
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
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public Ticket(int ticketnumber, String name, String email, String from, String to, String doj, String trainNumber) {
		super();
		Ticketnumber = ticketnumber;
		this.name = name;
		Email = email;
		this.from = from;
		this.to = to;
		this.doj = doj;
		this.trainNumber = trainNumber;
	}
	public Ticket() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ticket [Ticketnumber=" + Ticketnumber + ", name=" + name + ", Email=" + Email + ", from=" + from
				+ ", to=" + to + ", doj=" + doj + ", trainNumber=" + trainNumber + "]";
	}
	public void setstatus(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}

