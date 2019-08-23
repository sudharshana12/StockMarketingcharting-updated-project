package com.example.stockspring.dao;

import java.sql.SQLException;

import com.example.stockspring.model.Login;

public interface LoginDao {

	boolean isValidUser(String username, String password) throws ClassNotFoundException, SQLException;
 
}
