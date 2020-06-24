package com.bus.dao;

import com.bus.model.User;

public interface UserDao {
	
	public void saveUser(User user);
	public boolean authenticateUser(String userName,String password);

}
