package com.cognizant.mediator.main;

import com.cognizant.mediator.concrete.BasicUser;
import com.cognizant.mediator.concrete.ChatMediator;
import com.cognizant.mediator.concrete.PremiumUser;
import com.cognizant.mediator.interfaces.IChatMediator;
import com.cognizant.mediator.model.User;

public class Client {

	public static void main(String[] args) {
		IChatMediator mediator = new ChatMediator();

		User user1 = new BasicUser(mediator, "A");
		User user2 = new BasicUser(mediator, "B");
		User user3 = new PremiumUser(mediator, "C");
		User user4 = new PremiumUser(mediator, "D");

		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.sendMessage("Welcome");

	}

}
