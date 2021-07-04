package com.cognizant.observer.concrete;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.observer.interfaces.Observer;
import com.cognizant.observer.interfaces.Subject;
import com.cognizant.observer.model.Message;

public class MessagePublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyUpdate(Message message) {
		for (Observer o : observers) {
			o.update(message);
		}
	}

}
