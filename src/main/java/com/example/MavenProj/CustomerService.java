package com.example.MavenProj;

import org.springframework.stereotype.Service;

@Service
public class CustomerService 
{
	public String getDetails()
	{
		return "I am from service";
	}
}