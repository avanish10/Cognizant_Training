package com.cognizant.flightmanagement;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.flightmanagement.model.Flight;
import com.cognizant.flightmanagement.model.Passenger;
import com.cognizant.flightmanagement.service.FlightService;

@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
class FlightmanagementApplicationTests {
	
	
	
	
	
	

	@Test
	void contextLoads() {
	}
    
	@Test
	public void addeconomy()
	{
		Flight f = new Flight();
		FlightService fs = new FlightService();
		
		f.setFlightType("economy");
		Assert.assertTrue(fs.addFlight(f));
	}
	@Test
	public void addbusiness()
	{
		Flight f = new Flight();
		FlightService fs = new FlightService();
		f.setFlightType("business");
		Assert.assertTrue(fs.addFlight(f));
	}
	@Test
	public void addvipeconomy()
	{
		Flight f = new Flight();
		Passenger p = new Passenger();
		p.setName("a");
		p.setVip(true);
		f.setFlightType("economy");
		Assert.assertTrue(f.addPassenger(p));
	}
	@Test
	public void addvipbusiness()
	{
		Flight f = new Flight();
		Passenger p = new Passenger();
		p.setName("p");
		p.setVip(true);
		f.setFlightType("buisiness");
		Assert.assertTrue(f.addPassenger(p));
	}
	@Test
	public void nonvipeconomy()
	{
		Flight f = new Flight();
		Passenger p = new Passenger();
		p.setName("l");
		p.setVip(false);
		f.setFlightType("economy");
		Assert.assertTrue(f.addPassenger(p));
	}
	@Test
	public void nonvipbusiness()
	{
		Flight f = new Flight();
		Passenger p = new Passenger();
		p.setName("l");
		p.setVip(false);
		f.setFlightType("business");
		Assert.assertFalse(f.addPassenger(p));
	}
	@Test
	public void removevipeconomy()
	{
		Flight f = new Flight();
		Passenger p = new Passenger();
		p.setName("a");
		p.setVip(true);
		Assert.assertFalse(f.removePassenger(p));
		
	}
	@Test
	public void removevipbusiness()
	{
		Flight f = new Flight();
		Passenger p = new Passenger();
		p.setName("a");
		p.setVip(true);
		Assert.assertFalse(f.removePassenger(p));
		
	}
	@Test
	public void removenonvipeconomy()
	{
		Flight f = new Flight();
		Passenger p = new Passenger();
		p.setName("l");
		p.setVip(false);
		Assert.assertTrue(f.removePassenger(p));
		
	}
	@Test
	public void removenonvipbusiness()
	{
		Flight f = new Flight();
		Passenger p = new Passenger();
		p.setName("l");
		p.setVip(false);
		Assert.assertFalse(f.removePassenger(p));
		
	}
	
	
}
