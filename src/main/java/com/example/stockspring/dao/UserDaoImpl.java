package com.example.stockspring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.stockspring.model.User;
/*@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public User insertUser(User user) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
			PreparedStatement ps = conn.prepareStatement("insert into user (id,username,password,usertype,email,mobilenumber,confirmed) values (?,?,?,?,?,?,?)");
			ps.setInt(1,user.getId());
			ps.setString(2,user.getUsername());
			ps.setString(3,user.getPassword());
			ps.setString(4,user.getUserType());
			ps.setString(5,user.getEmail());
			ps.setInt(6,user.getMobileNumber());
			ps.setBoolean(7,user.isConfirmed());
			ps.executeUpdate();
			
		return user;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserList() {
		List<User> userList = new ArrayList<User>();
		try {
			 Class.forName("com.mysql.jdbc.Driver");  
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
			 PreparedStatement ps = conn.prepareStatement("Select * from user");
			 ResultSet rs = ps.executeQuery();
			 while(rs.next())
			 {
				 User user = new User();
				 user.setId(rs.getInt("id"));
				 user.setUsername(rs.getString("username"));
				 user.setPassword(rs.getString("password"));
				 user.setUserType(rs.getString("usertype"));
				 user.setEmail(rs.getString("email"));
				 user.setMobileNumber(rs.getInt("mobilenumber"));
				 user.setConfirmed(rs.getBoolean("confirmed"));
				 userList.add(user);
				 
			 }
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

}
*/