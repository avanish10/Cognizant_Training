package com.cognizant.springlearn.models;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import com.cognizant.springlearn.SpringLearnApplication;
public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	private String code;
	private String name;
	
	public Country()
	{
		
	}
	
	public Country(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		LOGGER.info("Start");
		LOGGER.debug("IN");
		LOGGER.info("End");
		return code;
	}
	public void setCode(String code) {
		LOGGER.info("Start");
		
		this.code = code;
		LOGGER.debug("IN");
		LOGGER.info("End");
	}
	public String getName() {
		LOGGER.info("Start");

		LOGGER.debug("India");
		
		LOGGER.info("End");
		return name;
	}
	public void setName(String name) {
		LOGGER.info("Start");

		
		this.name = name;
LOGGER.debug("India");
		
		LOGGER.info("End");
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}

	

}
