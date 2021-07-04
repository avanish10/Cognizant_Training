package com.cognizant.mediator.concrete;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.mediator.interfaces.IChatMediator;
import com.cognizant.mediator.model.User;

public class ChatMediator implements IChatMediator {

	private List<User> users;

	public ChatMediator() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		for (User u : this.users) {
			if (u != user) {
				u.receiveMessage(message);
			}
		}
	}

}
