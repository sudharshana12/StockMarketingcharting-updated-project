package com.example.stockspring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
@Entity
@Table(name = "ipo_planned")
public class IPOsPlanned {
	@Id
	@Column(name="id")
     private int id;
	@Column(name="Company_code")
     private int companyCode;
	@Column(name="Stock_exchange")
     private int StockExchange;
	@Column(name="price_per_share")
     private BigDecimal pricePerShare;
	@Column(name="total_no_of_shares")
     private int totalNumberOfShares;
	@Column(name="open_date_time")
     private String openDateTime;
	@Column(name="remarks")
     private String remarks;
     public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public int getStockExchange() {
		return StockExchange;
	}
	public void setStockExchange(int stockExchange) {
		StockExchange = stockExchange;
	}
	
	public BigDecimal getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(BigDecimal pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public int getTotalNumberOfShares() {
		return totalNumberOfShares;
	}
	public void setTotalNumberOfShares(int totalNumberOfShares) {
		this.totalNumberOfShares = totalNumberOfShares;
	}
	
	public String getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
