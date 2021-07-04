package com.cognizant.mediator.concrete;

import com.cognizant.mediator.interfaces.IChatMediator;
import com.cognizant.mediator.model.User;

public class PremiumUser extends User {

	public PremiumUser(IChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(this.name + ": Sending Message = " + message);
		mediator.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(this.name + ": Received Message : " + message);

	}

}
