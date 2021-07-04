package com.cognizant.observer.main;

import com.cognizant.observer.concrete.MessagePublisher;
import com.cognizant.observer.concrete.MessageSubscriberOne;
import com.cognizant.observer.concrete.MessageSubscriberThree;
import com.cognizant.observer.concrete.MessageSubscriberTwo;
import com.cognizant.observer.model.Message;

public class Main {

	public static void main(String[] args) {
		MessageSubscriberOne m1 = new MessageSubscriberOne();
		MessageSubscriberTwo m2 = new MessageSubscriberTwo();
		MessageSubscriberThree m3 = new MessageSubscriberThree();

		MessagePublisher messagePublisher = new MessagePublisher();

		messagePublisher.attach(m1);
		messagePublisher.attach(m2);

		messagePublisher.notifyUpdate(new Message("First Message"));

		messagePublisher.detach(m1);
		messagePublisher.attach(m3);

		messagePublisher.notifyUpdate(new Message("Second Message"));

	}
}
