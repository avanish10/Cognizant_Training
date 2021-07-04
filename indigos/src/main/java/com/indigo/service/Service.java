package com.indigo.service;

import java.util.List;

import com.indigo.model.Model;
import com.indigo.model.Passengers;


public class Service {

	
	public List<Passengers> addPassenger(Passengers passenger) {
		Model getmodel = passenger.getModel();
		if(getmodel.getFlightType().equalsIgnoreCase("economy") || passenger.isVip()) {
			//System.out.println(getmodel);
			getmodel.getList().add(passenger);
			//System.out.println(getmodel);
			return getmodel.getList();
		}
		else if(getmodel.getFlightType().equalsIgnoreCase("business") && passenger.isVip()) {
			getmodel.getList().add(passenger);
			return getmodel.getList();
		}
		return null;
	}
	public boolean removePassenger(Passengers passenger) {
		Model getmodel = passenger.getModel();
		if(!passenger.isVip()) {
			getmodel.getList().remove(passenger);
			return true;
		}
		return false;
	}
}
