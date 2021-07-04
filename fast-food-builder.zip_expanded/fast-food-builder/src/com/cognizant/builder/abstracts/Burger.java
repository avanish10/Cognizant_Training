package com.cognizant.builder.abstracts;

import com.cognizant.builder.concrete.Wrapper;
import com.cognizant.builder.interfaces.Item;
import com.cognizant.builder.interfaces.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}