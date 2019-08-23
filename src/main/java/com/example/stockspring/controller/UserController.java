package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.example.stockspring.model.User;

public interface UserController {

		// public String insertUser(User user) throws ClassNotFoundException, SQLException;
	     public User updateUser(User user);
	     public List<User> getUserList();
		String insertUser(@Valid User user, BindingResult result, Model model)
				throws ClassNotFoundException, SQLException;
	

}
