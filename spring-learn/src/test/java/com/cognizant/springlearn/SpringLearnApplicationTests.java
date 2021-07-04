package com.cognizant.springlearn;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.springlearn.controller.CountryController;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.ResultActions;
@SpringBootTest
class SpringLearnApplicationTests {
	@Autowired

	private CountryController countryController;
	@Autowired

	private MockMvc mvc;
	@Test

	public void contextLoads() {

	assertNotNull(countryController);

	}
	@Test

	public void testGetCountry1() throws Exception {

	}
	@Test

	public void testGetCountry2() throws Exception {

	ResultActions actions = mvc.perform(get("/country"));

	}
	@Test

	public void testGetCountry3() throws Exception {

	ResultActions actions = mvc.perform(get("/country"));

	actions.andExpect(status().isOk());

	}
	@Test

	public void getCountry4() throws Exception {

	ResultActions actions = mvc.perform(get("/country"));

	actions.andExpect(status().isOk());

	actions.andExpect(jsonPath("$.code").exists());

	}
	
	@Test

	public void getCountry5() throws Exception {

	ResultActions actions = mvc.perform(get("/country"));

	actions.andExpect(status().isOk());

	actions.andExpect(jsonPath("$.code").exists());

	actions.andExpect(jsonPath("$.code").value("IN"));

	}
	
	@Test
	public void testGetCountryException() throws Exception
	{
		ResultActions actions = mvc.perform(get("/country"));
		actions.andExpect(status().isBadRequest());

		actions.andExpect(status().reason("Country Not found"));
	}

}
