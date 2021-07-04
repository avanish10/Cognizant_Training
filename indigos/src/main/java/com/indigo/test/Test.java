package com.indigo.test;

import java.util.List;

import com.indigo.model.Model;
import com.indigo.model.Passengers;
import com.indigo.service.Service;

public class Test {
	
	public static void main(String[] args) {
		Model model = new Model("business","1200456");
		Passengers passenger = new Passengers("Saran",true,model);
		Service service = new Service();
		List<Passengers> list = service.addPassenger(passenger);
		for(Passengers i:list) {
			System.out.println(i.getModel().getFlightType());
			System.out.println(i.getModel().getFlightNumber());
			System.out.println(i.getName());
			System.out.println(i.isVip());
		}
	}

}
