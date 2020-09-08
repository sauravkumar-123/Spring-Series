package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Data throygh IOC container" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/config1.xml");
        Employee emp1=(Employee) context.getBean("employee1");
        Employee emp2=(Employee) context.getBean("employee2");
        Employee emp3=(Employee) context.getBean("employee3");
        System.out.println(emp1+" "+emp2+" "+emp3);
    }
}
