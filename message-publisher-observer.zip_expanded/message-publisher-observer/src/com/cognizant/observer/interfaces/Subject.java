package com.cognizant.observer.interfaces;

import com.cognizant.observer.model.Message;

public interface Subject {
	public void attach(Observer observer);

	public void detach(Observer observer);

	public void notifyUpdate(Message message);
}
