package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.IPOsPlanned;

public interface IpoService {
	  public IPOsPlanned insertIPO(IPOsPlanned ipo);
	 public IPOsPlanned updateIPO(IPOsPlanned company) throws ClassNotFoundException, SQLException;
	 public List<IPOsPlanned> getIPO();
	 List<IPOsPlanned> getIpoDetailsByCompany(String companyName);
}
