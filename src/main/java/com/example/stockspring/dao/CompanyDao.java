package com.example.stockspring.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import  com.example.stockspring.model.Company;

public interface CompanyDao extends JpaRepository<Company,Integer> {
  
	/* public Company insertCompany(Company company) throws SQLException, ClassNotFoundException;
	public Company updateCompany(Company company) throws SQLException, ClassNotFoundException;
	public List<Company> getAllCompany(); */
	
	public List<Company> findBySectorId(int sectorId);
	
	@Query("Select c from Company c where c.companyName LIKE %:pattern% ")
	List<Company> findByName(@Param("pattern") String pattern);

	Company findBycompanyName(String companyName);
	
	public List<Company> findBysectorId(int sectorid);
}
