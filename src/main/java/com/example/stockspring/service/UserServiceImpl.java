package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.UserDao;

import com.example.stockspring.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public User insertUser(User user) throws ClassNotFoundException, SQLException {
		return userDao.save(user);
	}

	@Override
	public User updateUser(User user) {
	return userDao.save(user);
	}

	@Override
	public List<User> getUserList() {
		return userDao.findAll();
	}

}
