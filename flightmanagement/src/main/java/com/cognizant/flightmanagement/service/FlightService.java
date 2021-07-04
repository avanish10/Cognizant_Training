package com.cognizant.flightmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.flightmanagement.model.Flight;
import com.cognizant.flightmanagement.model.Passenger;

@Service
public class FlightService {
   
	List<String> list1 = new ArrayList<>();
	List<String> list2 = new ArrayList<>();
	public boolean addFlight(Flight f)
	{
		if((f.getFlightType()).equalsIgnoreCase("economy"))
		{
			list1.add(f.getFlightType());
			return true;
		}
		else if((f.getFlightType()).equalsIgnoreCase("business")) 
		{
			list2.add(f.getFlightType());
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean addEconomyPassenger(Passenger p)
	{
		Flight f = new Flight();
		return f.addPassenger(p);
	}
	public boolean addBusinessPassenger(Passenger p)
	{
		Flight f = new Flight();
		return f.addPassenger(p);
	}
	public boolean deleteEconomyPassenger(Passenger p)
	{
		Flight f = new Flight();
		return f.removePassenger(p);
	}
	public boolean deleteBusinessPassenger(Passenger p)
	{
		Flight f = new Flight();
		return f.removePassenger(p);
	}
	
}
