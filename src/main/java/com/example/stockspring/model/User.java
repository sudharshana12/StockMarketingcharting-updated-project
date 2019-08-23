package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="user")
public class User {

@Id
private int id;
@NotEmpty(message="Please Enter the Username")
@Column(name="username")
  private String username;

@NotEmpty
@NotEmpty(message="Please enter the password")
@Column(name="password")
  private String password;
@Column(name="usertype")
  private String userType;

@Email(message="Please enter proper email")
@NotEmpty(message="Please enter the email")
@Column(name="email")
  private String email;
@NotNull(message="Please enter the mobile number")
@Column(name="mobilenumber")
  private int mobileNumber;
@Column(name="confirmed")
  private byte confirmed;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) {
	this.mobileNumber =  mobileNumber;
}
public byte getConfirmed() {
	return confirmed;
}
public void setConfirmed(byte confirmed) {
	this.confirmed = confirmed;
}

  
}
