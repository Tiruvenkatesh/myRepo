package com.tiru.springtest.SpringTest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import com.tiru.springtest.SpringTest.Annotation.CustomAnnotation;
import com.tiru.springtest.SpringTest.Events.CustomEvent;

@Component
public class Triangle implements Shape,ApplicationEventPublisherAware {
	private MessageSource messageSource;
	private ApplicationEventPublisher publisher;
	private List<Point> points;
	
	@CustomAnnotation
	public List<Point> getPoints() {
		return points;
	}

	
	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	@Autowired
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}


	public void draw() {
		for( Point p: points ){
			System.out.println("Point A of triangle is =>"+p.getX()+":"+p.getY());
			//System.out.println("Message Source message is "+this.messageSource.getMessage("x", null, "xx", Locale.US));
			publisher.publishEvent(new CustomEvent(this));
		}
		
	}

	
	
	@PostConstruct
	public void afterPropertiesSet1() throws Exception {
	System.out.println("Bean1 has got invoked");
		
	}

	@PreDestroy
	public void destroy1() throws Exception {
		System.out.println("Bean1 has got destroyed");
		
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher= publisher;
		
	}
	

	
}
