package com.example.stockspring.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stockpricedetail")
public class StockPrice {
	@Id
	@Column(name = "stock_code")
	private int stockCode;

	@Column(name = "stockexchange_id")
	private int stockExchange;
	@Column(name = "current_price")
	private double currentPrice;
	@Column(name = "date")
	private Date date;

	/*
	 * @ManyToOne(cascade = CascadeType.ALL )
	 * 
	 * @JoinColumn(name="company_code")
	 */
	//public Company company;
	
	@Column(name = "company_code")
	private int companyCode;

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public Date getDate() {
		return date;
	}

	

	public int getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(int stockExchange) {
		this.stockExchange = stockExchange;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public int getStockCode() {
		return stockCode;
	}

	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}

	public Date geDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
