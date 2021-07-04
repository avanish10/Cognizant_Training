package com.cognizant.factory;

import com.cognizant.factory.abs.Factory;
import com.cognizant.factory.abs.HeadLight;
import com.cognizant.factory.abs.Tire;
import com.cognizant.factory.headlight.MercedesHeadLight;
import com.cognizant.factory.tire.MercedesTire;

public class MercedesFactory extends Factory {

	@Override
	public HeadLight makeHeadlight() {
		// TODO Auto-generated method stub
		return new MercedesHeadLight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new MercedesTire();
	}

}
