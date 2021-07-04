package com.cognizant.flightmanagement.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Passenger {
	
	private String name;
	private boolean vip;
	

	public boolean isVip()
	{
		if(vip)
		return  true;
		else
			return false;
		
	}

}
