package com.example.stockspring.service;

import java.sql.SQLException;

import com.example.stockspring.model.Login;

public interface LoginService {
    public boolean isValidUser(String username,String password) throws ClassNotFoundException, SQLException;
}
