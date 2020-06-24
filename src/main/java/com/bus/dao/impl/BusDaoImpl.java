package com.bus.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bus.dao.BusDao;
import com.bus.model.Bus;
@Repository
public class BusDaoImpl implements BusDao{
	@Autowired
	SessionFactory sessionFactory;
	
    @Transactional
	public List<Bus> busDetail(String busNumber) {
		  List< Bus> busList=new ArrayList< Bus>();
		  Session session = sessionFactory.getCurrentSession();
		  String hql ="from Bus where busNumber= :busNumber"; //Named parametres
		  Query<Bus> query = session.createQuery(hql); 
		  query.setParameter("busNumber", busNumber);
		  busList=query.list(); 
		  return busList;
	}
	

}
