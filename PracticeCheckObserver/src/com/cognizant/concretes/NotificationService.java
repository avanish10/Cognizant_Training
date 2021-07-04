package com.cognizant.concretes;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.interfaces.INotificationObserver;
import com.cognizant.interfaces.INotificationService;
import com.cognizant.model.Name;

public class NotificationService implements INotificationService{

	 private List<INotificationObserver> list = new ArrayList<>();
	@Override
	public void addSubscriber(INotificationObserver ino) {
		// TODO Auto-generated method stub
		this.list.add(ino);
		
		System.out.println(list);
		
	}
	
	

	



	@Override
	public void removeSubscriber(INotificationObserver ino) {
		// TODO Auto-generated method stub
		this.list.remove(ino);
		System.out.println(list);

	}



	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for(INotificationObserver i:list)
		{
			i.OnServerDown();
		}
		
	}

	
}
