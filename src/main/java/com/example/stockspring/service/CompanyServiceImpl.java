package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.SectorDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
    CompanyDao companydao;
	@Autowired
	SectorDao sectordao;
	@Override
	public Company insertCompany(Company company) throws SQLException, ClassNotFoundException {
		companydao.save(company);
		return null;
	}

	@Override
	public Company updateCompany(Company company) throws ClassNotFoundException, SQLException {
		//companydao.updateCompany(company);
		return null;
	}

	@Override
	public List<Company> getAllCompanyList() {
		return companydao.findAll();
		
	}

	@Override
	public List<Company> getCompanyListSector(String sectorName) throws Exception {
		Sector sector = sectordao.findBysectorName(sectorName);
		return companydao.findBySectorId(sector.getSectorId());
	}
	
	@Override
	public List<Company> getCompanyMatchingservice(String pattern) throws Exception
	{
		return companydao.findByName(pattern);
	}

}
