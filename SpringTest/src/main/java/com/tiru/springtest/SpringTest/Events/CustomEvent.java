package com.tiru.springtest.SpringTest.Events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;

public class CustomEvent extends ApplicationEvent {
	
	public CustomEvent(Object source) {
		super(source);
		
	}

	public String toString() {
		return "this is custom Event";
	}
}
