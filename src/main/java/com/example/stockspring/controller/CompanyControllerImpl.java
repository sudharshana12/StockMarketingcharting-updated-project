package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.dao.CompanyDao;
//import com.example.stockspring.dao.CompanyDaoImpl;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.User;
import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.CompanyServiceImpl;

@Controller

public class CompanyControllerImpl implements CompanyController {
    
	@Autowired
	private CompanyService companyservice;
    @Override
	@RequestMapping(value="/createcompany",method = RequestMethod.POST)
	public String insertCompany(@Valid @ModelAttribute("company1")Company company,BindingResult result,Model model) throws SQLException, ClassNotFoundException {
		if(result.hasErrors())
		{
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			model.addAttribute("company1",company);
			return "admin-create-company";
		}
		companyservice.insertCompany(company);
		return "redirect:/cmpList";
	
	}
    
	
	@RequestMapping(value="/createcompany",method = RequestMethod.GET)
	public String companyForm(ModelMap model)
	{
		Company company = new Company();
		model.addAttribute("company1",company);
		return "admin-create-company";
		
	}
	

	
	
	@Override
	public Company updateCompany(Company company) throws ClassNotFoundException, SQLException {
		return companyservice.updateCompany(company);
		
	}
	@Override
	@RequestMapping(path="/cmpList")
	public ModelAndView getAllCompanyList() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin-manage-company");
		mv.addObject("cmpList",companyservice.getAllCompanyList());
	
		return mv;
		
	}

}
