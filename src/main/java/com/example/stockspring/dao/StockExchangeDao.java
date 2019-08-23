package com.example.stockspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.StockExchange;

public interface StockExchangeDao extends JpaRepository<StockExchange,Integer>{

}
