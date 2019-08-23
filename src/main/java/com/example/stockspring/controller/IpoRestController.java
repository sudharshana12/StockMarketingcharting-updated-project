package com.example.stockspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.model.IPOsPlanned;
import com.example.stockspring.service.IpoService;

@RestController
public class IpoRestController {
@Autowired
IpoService iposervice;

@GetMapping("company/getIpoDetails/{companyName}")
public List<IPOsPlanned> getIpoDetails(@PathVariable("companyName") String companyName) throws Exception
{
	return iposervice.getIpoDetailsByCompany(companyName);
	
}
}
