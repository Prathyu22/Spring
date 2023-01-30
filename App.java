package com.navin.Telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Types of Configurations:
// 1. Xml Based Configuration.
// 2. Annotation based configuration.
// 3. Java configuration.

//Here we used annotation based configuration.

public class App 
{
    public static void main( String[] args )
    {
    	// Here we have 2 classes. They are Car and Bike.
    	// In order to call the method of any class 
    	// we need to change the source code 
    	// that is we need to change the object mentioned in the source code. 
        
    	//Here comes the Dependency Injection (DI).
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	//getBean() is a method of ApplicationContext and Beanfactory Interfaces.
    	//In general, getBean() gives us the object so that we type cast it to Vehicle here.
    	
    	
    	//Here we are using annotation based configuration. So, here we should mention the class name in getBean(). 
    	//Vehicle obj = (Vehicle) context.getBean("car"); //new Car();
        //obj.drive();
        
    	Tyre t = (Tyre) context.getBean("tyre");
    	System.out.println(t);
        
    }
}
