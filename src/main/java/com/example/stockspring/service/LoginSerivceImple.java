package com.example.stockspring.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.LoginDao;
import com.example.stockspring.model.Login;
@Service
public class LoginSerivceImple implements LoginService{
	@Autowired
    LoginDao logindao;

	@Override
	public boolean isValidUser(String username, String password) throws ClassNotFoundException, SQLException {
	System.out.println("service");
		return logindao.isValidUser(username, password);
		
		
	}
	
	
}
