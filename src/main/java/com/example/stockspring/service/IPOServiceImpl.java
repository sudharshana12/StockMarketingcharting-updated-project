package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.IpoDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.IPOsPlanned;
@Service
public class IPOServiceImpl implements IpoService {
    
	@Autowired
	IpoDao ipodao;
	@Autowired
	CompanyDao companydao;
	@Override
	public IPOsPlanned updateIPO(IPOsPlanned company) throws ClassNotFoundException, SQLException {
		
		return null;
	}

	@Override
	public List<IPOsPlanned> getIPO() {
	   return  ipodao.findAll();
	}

	@Override
	public IPOsPlanned insertIPO(IPOsPlanned ipo) {
		ipodao.save(ipo);
		return null;
	}

	@Override
	public List<IPOsPlanned> getIpoDetailsByCompany(String companyName) {
		Company company = companydao.findBycompanyName(companyName);
		return ipodao.findByCompanyCode(company.getCompanyCode());
	}

}
