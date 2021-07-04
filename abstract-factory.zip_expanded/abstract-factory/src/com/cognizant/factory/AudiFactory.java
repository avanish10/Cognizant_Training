package com.cognizant.factory;

import com.cognizant.factory.abs.Factory;
import com.cognizant.factory.abs.HeadLight;
import com.cognizant.factory.abs.Tire;
import com.cognizant.factory.headlight.AudiHeadLight;
import com.cognizant.factory.tire.AudiTire;

public class AudiFactory extends Factory{

	@Override
	public HeadLight makeHeadlight() {
		// TODO Auto-generated method stub
		return new AudiHeadLight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}


}
