package com.springcore.AutoWiring.Annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Department_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "Data throygh IOC container" );
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/AutoWiring/Annotations/config5.xml");
        context.registerShutdownHook();
        Department dept1=context.getBean("department1",Department.class);
        System.out.println("Data through Department class :==--->"+dept1.toString());
	}

}
