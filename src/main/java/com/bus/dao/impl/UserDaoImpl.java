package com.bus.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bus.dao.UserDao;
import com.bus.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public void saveUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(user);

	}

	@Transactional
	public boolean authenticateUser(String userName, String password) {
		Session session = sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery("select * from User where userName=? and password=?");
		query.addEntity(User.class);
		query.setParameter(0, userName);
		query.setParameter(1, password);
		List result = query.list();
		if (result.size() > 0)
			return true;

		return false;
	}

}
