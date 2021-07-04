package com.cognizant.builder.concrete;

import com.cognizant.builder.abstracts.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
