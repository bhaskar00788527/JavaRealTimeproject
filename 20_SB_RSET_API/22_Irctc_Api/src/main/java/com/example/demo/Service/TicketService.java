package com.example.demo.Service;

import java.util.Collection;
import java.util.List;

import com.example.demo.Binding.Passenger;
import com.example.demo.Binding.Ticket;

public interface TicketService {
	
	public Ticket bookTicket(Passenger p);
	public Collection<Ticket> getAllTickets();

}
