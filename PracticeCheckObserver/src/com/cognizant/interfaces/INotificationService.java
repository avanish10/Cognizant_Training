package com.cognizant.interfaces;

import com.cognizant.model.Name;

public interface INotificationService {

	public void addSubscriber(INotificationObserver ino);
	public void removeSubscriber(INotificationObserver ino);
	public void notifySubscriber();
	}
