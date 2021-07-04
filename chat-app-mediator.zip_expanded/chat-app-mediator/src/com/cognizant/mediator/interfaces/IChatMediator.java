package com.cognizant.mediator.interfaces;

import com.cognizant.mediator.model.User;

public interface IChatMediator {
	void addUser(User user);

	public void sendMessage(String message, User user);
}
