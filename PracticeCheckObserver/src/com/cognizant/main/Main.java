package com.cognizant.main;

import com.cognizant.concretes.JohnObserver;
import com.cognizant.concretes.NotificationService;
import com.cognizant.concretes.SteveObserver;
import com.cognizant.interfaces.INotificationObserver;
import com.cognizant.interfaces.INotificationService;
import com.cognizant.model.Name;


public class Main {
	public static void main(String[] args)
	{
	
	SteveObserver s = new SteveObserver();
	JohnObserver j = new JohnObserver();
	
	NotificationService ns = new NotificationService();
	ns.addSubscriber(s);
	ns.addSubscriber(j);
	
	ns.notifySubscriber();
	ns.removeSubscriber(j);
	ns.notifySubscriber();
	
	}
	
	
	
	

}
