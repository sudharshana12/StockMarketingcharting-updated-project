package com.example.stockspring.dao;

import java.sql.*;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Company;
/*
@Repository
public class CompanyDaoImpl implements CompanyDao {
   
	@Override
	public Company insertCompany(Company company) throws SQLException, ClassNotFoundException {
		 Class.forName("com.mysql.jdbc.Driver");  
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
		PreparedStatement ps = conn.prepareStatement("insert into company (company_code,company_Name,turnover,ceo,boardofdirectors,sector_id,briefwriteup) values (?,?,?,?,?,?,?)");
		ps.setInt(1,company.getCompanyCode());
		ps.setString(2,company.getCompanyName());
		ps.setDouble(3,company.getTurnover());
		ps.setString(4,company.getCEO());
		ps.setString(5,company.getBoardOfDirectors());
		ps.setInt(6,company.getSectorId());
		ps.setString(7,company.getBriefWriteup());
		ps.executeUpdate();
		return company;
		
	
	}

	@Override
	public Company updateCompany(Company company) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
		PreparedStatement ps = conn.prepareStatement("update company SET company_Name = ? where company_code= ?"); 
	    ps.setString(1,company.getCompanyName());	
	    ps.setInt(2,company.getCompanyCode());
        ps.executeUpdate();
		return company;
	}
	
	public List<Company> getAllCompany()
	{
		List<Company> companyList = new ArrayList<Company>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
			PreparedStatement ps = conn.prepareStatement("Select * from company");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Company company = new Company();
				company.setCompanyCode(rs.getInt("company_code"));
				company.setCompanyName(rs.getString("company_Name"));
				company.setTurnover(rs.getDouble("turnover"));
				company.setCEO(rs.getString("ceo"));
				company.setBoardOfDirectors(rs.getString("boardofdirectors"));
				company.setSectorId(rs.getInt("sector_id"));
				company.setBriefWriteup(rs.getString("briefwriteup"));
				companyList.add(company);
				
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println("SQL List Exception"+e);
		}
		return companyList;
	}

 
    
	
}
 */
