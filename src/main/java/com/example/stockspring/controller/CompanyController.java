package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;


public interface CompanyController {
	
    public Company updateCompany(Company company) throws ClassNotFoundException, SQLException;
	public ModelAndView getAllCompanyList();
	public String insertCompany(@Valid Company company, BindingResult result, Model model)
			throws SQLException, ClassNotFoundException;
}
