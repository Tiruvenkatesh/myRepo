package com.tiru.springtest.SpringTest.Events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class CustomEventListener implements ApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("Application Event is "+event.toString());
		
	}

}
