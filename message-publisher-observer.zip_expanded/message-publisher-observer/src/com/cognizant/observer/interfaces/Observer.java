package com.cognizant.observer.interfaces;

import com.cognizant.observer.model.Message;

public interface Observer {
	public void update(Message message);
}
