package com.example.stockspring.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.IPOsPlanned;
import com.example.stockspring.model.StockExchange;
import com.example.stockspring.service.IpoService;
import com.example.stockspring.service.StockExchangeService;

@Controller
@RequestMapping("/Admin")
public class AdminController {
   
	@Autowired
	StockExchangeService stockservice;
	@Autowired
	IpoService iposervice;
	@RequestMapping("/admin-landing-page")
	public String viewAdminLandingPage()
	{
		return "admin-landing-page";
		
	}
	
	@RequestMapping("/admin-import-data")
	public String viewImportDataPage()
	{
		return "admin-import-data";
	}
	
	@RequestMapping("/admin-manage-company")
	public String viewManagePage()
	{
		return "admin-manage-company";
	}
	//Manage Ipos
	@RequestMapping(value="/createIpo",method=RequestMethod.GET)
	
	public String companyForm(ModelMap model)
	{
		IPOsPlanned ipo = new IPOsPlanned();
		model.addAttribute("ipo",ipo);
		return "admin-create-ipo";
		
	}
	
	@RequestMapping(value="/createIpo",method = RequestMethod.POST)
	public String insertIpo(IPOsPlanned ipo) throws SQLException, ClassNotFoundException {
		
		iposervice.insertIPO(ipo);
		return "redirect:/Admin/viewIpo";
	
	}
	@RequestMapping(value="/viewIpo",method=RequestMethod.GET)
    public ModelAndView viewIpo()
    {
    	ModelAndView mv = new ModelAndView();
		mv.setViewName("admin-update-IPO");
		mv.addObject("ipoList",iposervice.getIPO());
	
		return mv;
	
    }
	
	//Manage Exchange
	@RequestMapping(value="/createStock",method = RequestMethod.GET)
	public String stockForm(ModelMap model)
	{
		StockExchange stockex = new StockExchange();
		model.addAttribute("stock",stockex);
		return "admin-create-stock";
	}
	@RequestMapping(value="/createStock",method = RequestMethod.POST)
	public String insertStock(StockExchange stock)
	{
		stockservice.insertStock(stock);
		return "redirect:/Admin/viewStock";
	}
	@RequestMapping(value="/viewStock",method = RequestMethod.GET)
	public ModelAndView viewStock()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin-manage-exchange");
		mv.addObject("stockList",stockservice.getStockList());
		return mv;
	}
}
