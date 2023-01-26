package com.navin.Telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    	
    	
    	//When we use .xml files, there is no need to recompile the java file. 
    	// Only we can change the requirements in the .xml file. 
    	Vehicle obj = (Vehicle) context.getBean("vehicle"); //new Car();
        obj.drive();
        
        
    }
}
