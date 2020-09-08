package com.springcore.ConstructorInjuction;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsructorInjuction_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println( "Data throygh IOC container" );
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ConstructorInjuction/config3.xml");
        Person pr1=(Person) context.getBean("person1");
        System.out.println("Data through Person class :==--->"+pr1);
        //pr1.display();
        context.registerShutdownHook();
	}

}
