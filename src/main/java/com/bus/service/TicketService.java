package com.bus.service;

import java.util.List;

import com.bus.model.Ticket;

public interface TicketService {

	public List<Ticket> saveTicketDetails(int busScheduleId, int busId);

}
