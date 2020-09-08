package com.springcore.StandaloneCollections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Passengers_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println( "Data throygh IOC container" );
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/StandaloneCollections/config6.xml");
        context.registerShutdownHook();
        Passengers pass1=context.getBean("Passengers1",Passengers.class);
        System.out.println("Data through Passengers1 class :==--->"+pass1.toString());
	}

}
