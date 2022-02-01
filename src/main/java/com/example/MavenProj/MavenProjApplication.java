package com.example.MavenProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenProjApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MavenProjApplication.class, args);
		System.out.println("Greetings from Spring Boot!");
	}
}