package com.cognizant.builder.concrete;

import com.cognizant.builder.interfaces.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
