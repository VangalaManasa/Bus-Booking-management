package com.bus.dao;

import java.util.List;

import com.bus.model.Ticket;

public interface TicketDao {

	public List<Ticket> saveTicketDetails(int busScheduleId, int busId);

}
