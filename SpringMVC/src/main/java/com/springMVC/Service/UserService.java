package com.springMVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.Dao.UserDao;
import com.springMVC.Model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;
	
	public int createUser(User user) {
		
		return this.userdao.saveUser(user);
	}
}
