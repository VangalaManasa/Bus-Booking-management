package com.bus.dao.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bus.dao.TicketDao;
import com.bus.model.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao {
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	@Override
	public List<Ticket> saveTicketDetails(int busScheduleId, int busId) {
		List<Ticket> ticketList = new ArrayList<Ticket>();
		Session session = sessionFactory.getCurrentSession();

		Ticket ticket = new Ticket();
		ticket.setBusId(busId);
		ticket.setBusScheduleId(busScheduleId);
		ticket.setDateTime(LocalDateTime.now());
		session.save(ticket);
		String hql = "from Ticket  where busScheduleId= :busScheduleId";
		Query<Ticket> query = session.createQuery(hql);
		query.setParameter("busScheduleId", busScheduleId);
		System.out.println("from query");
		ticketList = query.list();
		return ticketList;

	}

}
