package com.bus.service;

import com.bus.model.User;

public interface UserService {
	
	public void saveUser(User user);
	public boolean  authenticateUser(String userName, String password);

}
