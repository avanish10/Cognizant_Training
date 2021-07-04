package com.cognizant.observer.concrete;

import com.cognizant.observer.interfaces.Observer;
import com.cognizant.observer.model.Message;

public class MessageSubscriberThree implements Observer {

	@Override
	public void update(Message message) {
		System.out.println("MessageSubscriberThree :: " + message.getMessageContent());
	}

}
