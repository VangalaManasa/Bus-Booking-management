package com.bus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.dao.UserDao;
import com.bus.model.User;
import com.bus.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    UserDao userDao;

	public void saveUser(User user) {
		userDao.saveUser(user);
		
	}

	public boolean authenticateUser(String userName, String password) {
		
		return userDao.authenticateUser(userName, password);
	}
    

	

}
