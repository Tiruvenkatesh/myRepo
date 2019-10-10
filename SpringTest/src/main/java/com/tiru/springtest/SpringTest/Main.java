package com.tiru.springtest.SpringTest;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	context.registerShutdownHook();
    	Shape s =   context.getBean("triangle",Shape.class);
       s.draw();
    	
        
       // System.out.println(context.getMessage("x", null, "xx", Locale.US));
    }
}
