package com.springcore.WithoutXML;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class AppRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Short> hs=new HashSet<Short>();
		hs.add((short) 1510);
		hs.add((short) 1511);
		hs.add((short) 1512);
		hs.add((short) 1513);
		hs.add((short) 1514);
		hs.add((short) 1515);
		hs.add((short) 1516);
		hs.add((short) 1511);
		hs.add((short) 1514);
		hs.add(null);
		
		
		ArrayList<String> al=new ArrayList<String>(); 
		al.add("Saurav Kumar");
		al.add("Krishna Kumar");
		al.add("Gopal");
		al.add("Madhav Singh");
		al.add("Kishore kumar");
		al.add("R.S Khan");
		al.add("P.K Sinha");
		al.add("Kamal Jeet");
		al.add("Krishna Kumar");
		al.add(null);
		
		LinkedHashMap<Integer,String> lhmp=new LinkedHashMap<Integer,String>();
		lhmp.put(89584, "Bhopal");
		lhmp.put(24574, "Patna");
		lhmp.put(74851, "Indore");
		lhmp.put(87417, "Jaipur");
		lhmp.put(98547, "Bengaluru");
		lhmp.put(74152, "Patna");
		lhmp.put(74853, "Bhopal");
		lhmp.put(89584, "Bhagalpur");
		
		Properties prop=new Properties();
		prop.put("user_id","krsaurav123");
		prop.put("password","Saurav@123");
		prop.put("OTP",7847);
		
		
		System.out.println("Data throygh IOC container");
		
		Passengers_Properties pps=new Passengers_Properties();
		pps.setProperty((short) 12224,"Magadh Express",hs,al,lhmp,prop);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigAnnotations.class);
		
		Passengers pass1 = context.getBean("obj1", Passengers.class);
		System.out.println("Passengers details :"+pass1.toString());
	}

}
