package com.bus.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bus.dao.BusScheduleDao;
import com.bus.model.BusSchedule;
@Repository
public class BusScheduleDaoImpl implements BusScheduleDao {
	@Autowired
	SessionFactory sessionFactory;
	
    @Transactional
	public List<BusSchedule> getBuses(String source, String destination, Date departureDate) {
		 Session session=sessionFactory.getCurrentSession();
	       SQLQuery query=session.createSQLQuery("select * from BusSchedule where source=? and destination=? and departureDate=?");
	         query.addEntity(BusSchedule.class);
			 query.setParameter(0, source);
	         query.setParameter(1,destination);
	         query.setParameter(2,departureDate);
			List result=query.list();
			if(result.size()>0)
			{
				return result;
			}
			return null;
		
	}
    @Transactional
	public BusSchedule busDetails(int busScheduleId) {
		Session session = sessionFactory.getCurrentSession();

  		BusSchedule busDetails = (BusSchedule) session.get(BusSchedule.class,busScheduleId);
  		return busDetails;
	}

}
