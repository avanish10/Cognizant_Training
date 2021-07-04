package com.cognizant.mediator.model;

import com.cognizant.mediator.interfaces.IChatMediator;

public abstract class User {
	protected IChatMediator mediator;
	protected String name;

	public User(IChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void sendMessage(String message);

	public abstract void receiveMessage(String message);
}
