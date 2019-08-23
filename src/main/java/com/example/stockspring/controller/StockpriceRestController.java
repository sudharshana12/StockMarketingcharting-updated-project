package com.example.stockspring.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.StockPrice;
import com.example.stockspring.service.StockPriceService;


@RestController
public class StockpriceRestController {
	
	@Autowired
	StockPriceService stockpriceservice;
	@Autowired
	CompanyDao companydao;
	@Autowired
	StockPriceDao stockpricedao;

	/*@GetMapping("/company/stockprice/{companyName}")
	public int getCompanyStockprice(@PathVariable("companyName") String companyName)
	{
		Company company= companydao.findBycompanyName(companyName);
		int companycode = company.getCompanyCode();
		int stockcode = stockpricedao.getStockCodefromCompany(companycode);
		int currentprice =  stockpricedao.getCompanyStockPrice(stockcode);
		return currentprice;
		
	}*/
	
	@GetMapping("/company/stockprice/{companyName}/{from_date}/{to_date}")
	public List<Integer> getCompanyStockprice(@PathVariable("companyName") String companyName,@PathVariable("from_date") Date from_date,@PathVariable("to_date") Date to_date)
	{
		Company company = companydao.findBycompanyName(companyName);
		int companyCode = company.getCompanyCode();
		System.out.println(companyCode);
		//return stockpricedao.findBycompanyCode(companyCode);
		List<Integer> stockprice = stockpricedao.getStockPrice(companyCode,from_date,to_date);
		return stockprice;
	}
	
	
}
