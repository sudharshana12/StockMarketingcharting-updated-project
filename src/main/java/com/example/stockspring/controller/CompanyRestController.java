package com.example.stockspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.IPOsPlanned;
import com.example.stockspring.service.CompanyService;

@RestController
public class CompanyRestController {
  
	@Autowired
	CompanyService companyservice;
	
	@GetMapping("/companyList/{sectorName}")
	public List<Company> getCompanyList(@PathVariable("sectorName") String sectorName) throws Exception
	{
		return companyservice.getCompanyListSector(sectorName);
	}
	
	@GetMapping("/companyList/company/{pattern}")
	public List<Company> getCompanyMatching(@PathVariable("pattern") String pattern) throws Exception
	{
		
		return companyservice.getCompanyMatchingservice(pattern);
		
	}
	
	
}
