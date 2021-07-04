package com.cognizant.mediator.interfaces;

import com.cognizant.mediator.model.User;

public interface IUser {
	public void recieveMessage(String message, User user);

	public void sendMessage(String message, User user);

}
