package com.springcore.WithoutXML;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackages="com.spring.StereotypeAnnotations")
public class JavaConfigAnnotations 
{
	
	
	
	@Bean(name= {"obj1","obj2","obj3"})
	public Passengers getPassengers()
	{
		
		Passengers passg=new Passengers();
		return passg;
	}

}
