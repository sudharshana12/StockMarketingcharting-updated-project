package com.example.stockspring.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.SectorDao;
import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;
import com.example.stockspring.model.StockPrice;

@RestController
public class SectorRestController {
    
	@Autowired
	SectorDao sectordao;
	@Autowired
	CompanyDao companydao;
	@Autowired
	StockPriceDao stockpricedao;
	
	@GetMapping("/company/sector/{sectorName}/{from_date}/{to_date}")
	public List<Integer> getSectorStockPrice(@PathVariable("sectorName") String sectorName,@PathVariable("from_date") Date from_date,@PathVariable("to_date") Date to_date)
	{
		List<Integer> sectorStockprice=new ArrayList<Integer>();
		Sector sector = sectordao.findBysectorName(sectorName);
		int sectorid = sector.getSectorId();
		List<Company> company = companydao.findBysectorId(sectorid);
		for(int i=0;i<company.size();i++)
		{
		
		int companycode = ((Company) company).getCompanyCode();
		 sectorStockprice.addAll(stockpricedao.getStockPrice(companycode, from_date, to_date));
		
		
		}
		return sectorStockprice;
	}
	
	
}
