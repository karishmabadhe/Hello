package com.example.MavenProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer
{
	@Autowired
	private CustomerService service;
	
	@GetMapping(path="/all")
	@ResponseBody
	public String getDetails() 
	{
		return service.getDetails();
	}
}