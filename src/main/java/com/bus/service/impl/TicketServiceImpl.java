package com.bus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.dao.TicketDao;
import com.bus.model.Ticket;
import com.bus.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	TicketDao ticketDao;

	@Override
	public List<Ticket> saveTicketDetails(int busScheduleId, int busId) {
		return ticketDao.saveTicketDetails(busScheduleId, busId);
	}

}
