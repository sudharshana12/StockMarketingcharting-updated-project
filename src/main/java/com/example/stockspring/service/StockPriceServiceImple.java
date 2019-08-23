package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.IPOsPlanned;
import com.example.stockspring.model.StockPrice;
@Service
public class StockPriceServiceImple implements StockPriceService{
    
	@Autowired
	StockPriceDao stockpriceDao;
	@Autowired
	CompanyDao companydao;
	@Override
	public List<StockPrice> getAllStockPrice() {
		return stockpriceDao.findAll();
	}

    
	

}
