package com.cognizant.factory.abs;

public abstract class HeadLight {

	private String headLightModel = "";

	public HeadLight(String headLightModel) {
		this.headLightModel = headLightModel;
	}

	public String get_headLightModel() {
		return headLightModel;
	}

}
