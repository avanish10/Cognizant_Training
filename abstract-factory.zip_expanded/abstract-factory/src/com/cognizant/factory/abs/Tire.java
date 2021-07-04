package com.cognizant.factory.abs;

public abstract class Tire {
	protected String tireModel = "";

	public Tire(String tireModel) {
		this.tireModel = tireModel;
	}

	public String getTireModel() {
		return tireModel;
	}
}
