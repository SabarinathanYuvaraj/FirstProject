package com.school.sba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.school.sba.serviceimpl.SchoolServiceImpl;

@SpringBootApplication
public class SchoolBoardApiApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(SchoolBoardApiApplication.class, args);
		System.out.println("Ran Successful");
	}
	public SchoolServiceImpl getobj()
	{
		return new SchoolServiceImpl();
	}
}
