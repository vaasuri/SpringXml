package com.vaasuri.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Example of a Spring application configured using XML configuration.
 * In this simple example, notice how the two beans are defined in the
 * 'spring.xml' file with different scope settings (prototype & singleton).
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory  = new ClassPathXmlApplicationContext("spring.xml");
    	
    	HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorld");
    	helloWorld.message();
    	
    	System.out.println();

    	HelloWorld helloWorld2 = (HelloWorld) factory.getBean("helloWorld");
    	helloWorld2.message();
    }
}
