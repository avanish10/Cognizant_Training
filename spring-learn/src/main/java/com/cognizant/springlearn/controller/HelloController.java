package com.cognizant.springlearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.SpringLearnApplication;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
@RestController
public class HelloController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	
	@RequestMapping(value="/hello")
	public String sayHello()
	{
		LOGGER.info("Start");
		LOGGER.debug("print");

		LOGGER.info("End");
		return "Hello World!!";
	}

}
