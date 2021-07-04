/*
 * package com.cognizant.springlearn.service;
 * 
 * import java.util.ArrayList; import java.util.ListIterator;
 * 
 * import org.springframework.context.ApplicationContext; import
 * org.springframework.context.support.ClassPathXmlApplicationContext; import
 * org.springframework.stereotype.Service; import
 * org.springframework.web.bind.annotation.PathVariable;
 * 
 * import com.cognizant.springlearn.exception.CountryNotFoundException; import
 * com.cognizant.springlearn.models.Country;
 * 
 * @Service public class CountryService { public String
 * getCountry(@PathVariable("code") String code) throws CountryNotFoundException
 * { //Country country = new Country(); //country.setCode(code); String s;
 * boolean ans = false; ApplicationContext context = new
 * ClassPathXmlApplicationContext("country.xml"); ArrayList<Country> c =
 * (ArrayList<Country>) context.getBean("countryList"); ListIterator<Country> it
 * = c.listIterator(); while(it.hasNext()) {
 * if(((it.next()).equalsIgnoreCase(code))) { ans = true; s = it.next(); return
 * s; }
 * 
 * } if(!ans) { throw new CountryNotFoundException(); } return "";
 * 
 * 
 * 
 * 
 * 
 * 
 * } }
 */