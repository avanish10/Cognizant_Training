package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.models.Country;
//import com.cognizant.springlearn.service.CountryService;

@RestController
public class CountryController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
   
	//@Autowired 
	//CountryService countryService;
	
	@RequestMapping(value="/country")
	public Country getCountryIndia()
	{
LOGGER.info("Start");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country c = context.getBean("in",Country.class);
		
		LOGGER.info("End");
		return c;
	}
	@GetMapping(value="/countries")
	public List<Country> getAllCountries()
	{
LOGGER.info("Start");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> c = (ArrayList<Country>) context.getBean("countryList");
		LOGGER.info("End");
		return c;
	}
	/**
	 * @param code
	 * @return
	 * @throws CountryNotFoundException
	 */
//	@GetMapping(value="/countries/{code}")
//	public Country getCountry(String code) throws CountryNotFoundException
//	{
//		LOGGER.info("Start");
//		code = countryService.getCountry(code);
//		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
//		Country country = context.getBean(code,Country.class);
//		LOGGER.info("End");
//		return country;
//		
//	}
//	

}
