package com.tiru.springtest.SpringTest;



import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	
	static Logger log = Logger.getLogger(Main.class.getName());
    public static void main( String[] args )
    {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	context.registerShutdownHook();
    	Shape s =  context.getBean("triangle",Shape.class);
       s.draw();
    	
       log.info("Exiting the program");
       // System.out.println(context.getMessage("x", null, "xx", Locale.US));
    }
}
