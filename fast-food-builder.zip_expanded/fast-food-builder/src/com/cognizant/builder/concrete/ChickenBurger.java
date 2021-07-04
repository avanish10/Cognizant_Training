package com.cognizant.builder.concrete;

import com.cognizant.builder.abstracts.Burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.0f;
	}

}
