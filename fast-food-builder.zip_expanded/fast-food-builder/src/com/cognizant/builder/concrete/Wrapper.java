package com.cognizant.builder.concrete;

import com.cognizant.builder.interfaces.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}
