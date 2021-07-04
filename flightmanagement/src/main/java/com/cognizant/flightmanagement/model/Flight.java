package com.cognizant.flightmanagement.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Flight {
	private String id;
	private String flightType;
	private List<Passenger> passengers;
	
   public boolean addPassenger(Passenger p)
   {
	  if(flightType.equalsIgnoreCase("Economy"))
	  {
		  passengers.add(p);
		  return true;
	  }
	  else
	  {
		  if(p.isVip())
		  {
			  passengers.add(p);
			  return true;
		  }
	  }
	  return false;
   }
   
   public boolean removePassenger(Passenger p)
   {
	   if(p.isVip())
	   {
	   return false;
	   }
	   //else if(flightType.equalsIgnoreCase("Economy"))
	   //{
		 //  passengers.remove(p);
		  // return true;
	   //}
	   else
		   return false;
   }
}
