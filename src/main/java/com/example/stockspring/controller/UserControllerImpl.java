package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Login;
import com.example.stockspring.model.StockPrice;
import com.example.stockspring.model.User;
import com.example.stockspring.service.IpoService;
import com.example.stockspring.service.LoginService;
import com.example.stockspring.service.StockPriceService;
import com.example.stockspring.service.UserService;
import com.example.stockspring.service.UserServiceImpl;


@Controller
@RequestMapping("/User")
public class UserControllerImpl implements UserController {
	@ModelAttribute("usertype")
	public List<String> setValues(){
		List<String> usertype = new ArrayList<String>();
		usertype.add("Admin");
		usertype.add("User");
		return usertype;
	}
	@Autowired
	private UserService userservice;
	@Autowired
	private LoginService loginservice;
	@Autowired
	private IpoService iposervice;
	@Autowired
	private StockPriceService stockpriceservice;
    @RequestMapping(value="/viewIpo",method=RequestMethod.GET)
    public ModelAndView viewIpo()
    {
    	ModelAndView mv = new ModelAndView();
		mv.setViewName("user-view-IPO");
		mv.addObject("ipoList",iposervice.getIPO());
	
		return mv;
	
    }
	@RequestMapping(value="/registerUser", method = RequestMethod.POST)
	@Override
	public String insertUser(@Valid @ModelAttribute("user2")User user,BindingResult result,Model model) throws ClassNotFoundException, SQLException {
		 if(result.hasErrors())
		 {
			 System.out.println(result.getAllErrors());
			 model.addAttribute("user2",user);
			 return "user-register";
		 }
		 user.setUserType("User");
		 userservice.insertUser(user);
		 
		 return "redirect:/User/login";
	}
	
	@RequestMapping(value="/registerUser", method = RequestMethod.GET)
	public String userRegisterPage(ModelMap model)
	{
		User user = new User();
		model.addAttribute("user2",user);
		return "user-register";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public ModelAndView loginPage(ModelAndView model)
	{  
		model = new ModelAndView("login");
		Login login = new Login();
		model.addObject("login", login);
		return model;
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ModelAndView loginPagepost(Login login) throws ClassNotFoundException, SQLException
	{
		System.out.println("login post");
		System.out.println(login.getUsername());
		System.out.println(login.getPassword());
		ModelAndView model= null;
		
		
	     if(login.getUsername().equals("Admin") && login.getPassword().equals("admin"))
 		{
 			System.out.println("Success Login ADMIN");
 			model = new ModelAndView("admin-landing-page");
			
 		
 		}
	     else {
	    	 boolean isValidUser = loginservice.isValidUser(login.getUsername(), login.getPassword());
	       if(isValidUser)
	       {
			System.out.println("Success Login");
			 model = new ModelAndView("user-landing-page");
		   }
		else
		{
			/*System.out.println("Invalid User!");
			ModelMap modelmap = new ModelMap("login");
			modelmap.addAttribute("login", login); */
			model = new ModelAndView("login");
			model.addObject("login",login);
			
		}
	     }
		
		
		return model;
	}

	
	@RequestMapping(value="/user-compare-company")
	public String viewCompareCompany()
	{
		
		return "user-compare-company";
		
		
	}
	@RequestMapping(value="/user-landing-page",method = RequestMethod.GET)
	public ModelAndView viewUserLandingPage(StockPrice stockprice)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user-landing-page");
		mv.addObject("stockpriceList",stockpriceservice.getAllStockPrice());
	    System.out.println(stockpriceservice.getAllStockPrice());
		return mv;
		
		
	}
	
	@Override
	public User updateUser(User user) {
		return userservice.updateUser(user);
	}

	@Override
	public List<User> getUserList() {
		return userservice.getUserList();
	}
 
}
