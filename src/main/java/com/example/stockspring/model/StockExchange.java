package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stockexchange")
public class StockExchange {
	@Id
	@Column(name="stockexchange_id")
    private int id;
	
	@Column(name="stockexchangename")
    private String stockExchangeName;
   
	@Column(name="brief")
    private String brief;
	@Column(name="contactaddress")
    private String contactAddress;
	@Column(name="remarks")
    private String remarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	 public String getStockExchangeName() {
			return stockExchangeName;
		}
		public void setStockExchangeName(String stockExchangeName) {
			this.stockExchangeName = stockExchangeName;
		}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
