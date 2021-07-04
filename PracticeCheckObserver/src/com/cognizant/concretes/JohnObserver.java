package com.cognizant.concretes;

import com.cognizant.interfaces.INotificationObserver;
import com.cognizant.model.Name;

public class JohnObserver implements INotificationObserver{

	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		System.out.println("john Received");
	}

}
