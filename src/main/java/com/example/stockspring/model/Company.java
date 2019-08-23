package com.example.stockspring.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Company {
	@Id
	@Column(name="company_code")
	  private int companyCode;
	
	@Column(name="company_Name")
      private String companyName;
	
	@Column(name="turnover")
      private BigDecimal turnover;
	
	@Column(name="ceo")
      private String CEO;
	
	@Column(name="boardofdirectors")
      private String boardOfDirectors;
	
     // private List<StockExchange> stockExchange;
      
      @Column(name="sector_id")
      private int sectorId;
      
      @Column(name="briefwriteup")
      private String briefWriteup;
    
   
	public BigDecimal getTurnover() {
		return turnover;
	}
	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	
	
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String cEO) {
		CEO = cEO;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	
/*	public List<StockExchange> getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(List<StockExchange> stockExchange) {
		this.stockExchange = stockExchange;
	} 
	*/


      
}
