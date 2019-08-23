package com.example.stockspring.dao;

import java.sql.*;

import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Login;

@Repository
public class LoginDaoImpl implements LoginDao{


	@Override
	public boolean isValidUser(String username, String password) throws ClassNotFoundException, SQLException {
		System.out.println("dao");
		Login login = new Login();
		Class.forName("com.mysql.jdbc.Driver");  
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
		PreparedStatement ps = conn.prepareStatement("select count(1) from user where username = ? and password = ?");
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet resultSet = ps.executeQuery();
     
        if(resultSet.next())
            return (resultSet.getInt(1) > 0);
        
        else
           return false;
       }
		
	}


