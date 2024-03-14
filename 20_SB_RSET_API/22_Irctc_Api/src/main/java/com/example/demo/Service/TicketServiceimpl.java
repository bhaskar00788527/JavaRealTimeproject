package com.example.demo.Service;

import java.util.Collection;
import java.util.Random;

import com.example.demo.Binding.Passenger;
import com.example.demo.Binding.Ticket;

public class TicketServiceimpl implements TicketService{

	private static final String Beansutils = null;
	private Object map;

	@Override
	public Ticket bookTicket(Passenger p)
	{
		Ticket t=new Ticket();
		Random r=new Random(1000);
		int id=r.nextInt();
		t.setTicketnumber(id);
		Beansutils.Properties(p,t);
		t.setstatus("conformed");
		((Object) map).put(id,t);
		return t;
		
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		((Object) map).values(12);
	}

}
