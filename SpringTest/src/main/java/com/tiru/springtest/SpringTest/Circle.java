package com.tiru.springtest.SpringTest;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "PROTOTYPE")
public class Circle implements Shape {
	
	private Point  center;

	public Point getCenter() {
		return center;
	}
	
	@Resource()
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("This is a circle with center as =>"+getCenter().getX()+","+getCenter().getY());
		
	}

}
