package com.spring.StereotypeAnnotations;

import java.beans.Expression;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Data throygh IOC container");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/StereotypeAnnotations/config7.xml");
		context.registerShutdownHook();
		Employee emp1 = (Employee) context.getBean("emp1");
		
		Employee emp2 = (Employee) context.getBean("emp1");
		//System.out.println(emp1.hashCode() + " " + emp2.hashCode());
		/*
		 * Employee emp2=(Employee) context.getBean("employee2"); Employee
		 * emp3=(Employee) context.getBean("employee3");
		 */
		Passengers pass1 = context.getBean("pass1", Passengers.class);
		
		Passengers pass2 = context.getBean("pass1", Passengers.class);

		//System.out.println(pass1.hashCode() + " " + pass2.hashCode());

		System.out.println("Employee Details :" + emp1.toString());
		
		System.out.println("Passengers Details :" + pass1.toString());

		/*
		 * //spring parseExpression. SpelExpressionParser exp=new
		 * SpelExpressionParser(); Expression res=(Expression)
		 * exp.parseExpression("85+41*12");
		 * System.out.println("Result  :"+res.getValue());
		 */
	}
}
