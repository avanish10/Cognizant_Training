package com.cognizant.springlearn;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.models.Country;
import com.cognizant.springlearn.models.Country;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
@SpringBootApplication
public class SpringLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public void displayDate()
	{
		LOGGER.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("src/main/resources/dateFormat", SimpleDateFormat.class);
		LOGGER.debug("31/12/2018");
		LOGGER.info("End");
	}
	public static void displayCountry()
	{
		LOGGER.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = (Country) context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
		LOGGER.info("End");
	}
	public static void displayCountries()
	{
		LOGGER.info("Start");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> list = (ArrayList<Country>) context.getBean("countryList");
		
		LOGGER.info("Countries : {}", list.toString());
		LOGGER.info("End");
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		//displayCountry();
		displayCountries();
		
	}

}
