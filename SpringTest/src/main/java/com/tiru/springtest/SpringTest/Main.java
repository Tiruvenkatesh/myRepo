package com.tiru.springtest.SpringTest;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tiru.springtest.SpringTest.DAOTest.DAOTester;

public class Main 
{
    public static void main( String[] args )
    {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	context.registerShutdownHook();
    	Shape s =   context.getBean("triangle",Shape.class);
       s.draw();
       DAOTester d = new DAOTester();
       System.out.println(d.getDataSource());
       System.out.println(d.getModemInstance());    	
        
       // System.out.println(context.getMessage("x", null, "xx", Locale.US));
    }
}
