package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.StockExchangeDao;
import com.example.stockspring.model.StockExchange;
@Service
public class StockExchangeServiceImpl implements StockExchangeService {
   
	@Autowired
	StockExchangeDao stockdao;
	@Override
	public StockExchange insertStock(StockExchange stockexchange) {
		System.out.println("insert service");
		 stockdao.save(stockexchange);
		 return null;
	}

	@Override
	public List<StockExchange> getStockList() {
	   
		return stockdao.findAll();
	}
  
}
