package com.cognizant.builder.abstracts;

import com.cognizant.builder.concrete.Bottle;
import com.cognizant.builder.interfaces.Item;
import com.cognizant.builder.interfaces.Packing;

public abstract class ColdDrink implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
