package com.cognizant.flightmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cognizant.flightmanagement.exception.InvalidFlightOperation;
import com.cognizant.flightmanagement.model.Passenger;
import com.cognizant.flightmanagement.service.FlightService;

import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	FlightService flightService;
	
	@PostMapping("/flights/business")
	public String business(Passenger p)
	{
		if(p==null){
			log.error("Enter proper passenger details",new InvalidFlightOperation("Planned"));
			flightService.addBusinessPassenger(p);
			
		}
		else {
			log.info("Done");
		}
		return "";
		
	}
	
	@PostMapping("/flights/economy")
	public String economy(Passenger p)
	{
		if(p==null){
			log.error("Enter proper passenger details",new InvalidFlightOperation("Planned"));
			flightService.addEconomyPassenger(p);
			
		}
		else {
			log.info("Done");
		}
		return "";
		
	}
	
	@DeleteMapping("/flights/business")
	public String deleteBusiness(Passenger p)
	{
		if(p==null){
			log.error("Enter proper passenger details",new InvalidFlightOperation("Planned"));
			flightService.deleteBusinessPassenger(p);
			
		}
		else {
			log.info("Done");
		}
		return "";
		
	}
	
	@DeleteMapping("/flights/economy")
	public String deleteEconomy(Passenger p)
	{
		if(p==null){
			log.error("Enter proper passenger details",new InvalidFlightOperation("Planned"));
			flightService.deleteEconomyPassenger(p);
			
		}
		else {
			log.info("Done");
		}
		return "";
		
	}
	
	
	
	
	
	
	

}
