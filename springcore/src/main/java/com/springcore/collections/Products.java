package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class Products implements InitializingBean,DisposableBean
{
   private Set<Integer> product_id;
   private List<String> product_name;
   private Map<String,Double> product_price;
   private Properties user_name;
   
   
public Products() {
	super();
	// TODO Auto-generated constructor stub
}



public Products(Set<Integer> product_id, List<String> product_name, Map<String, Double> product_price,Properties user_name) {
	super();
	this.product_id = product_id;
	this.product_name = product_name;
	this.product_price = product_price;
	this.user_name=user_name;
}


public Set<Integer> getProduct_id() {
	return product_id;
}



public void setProduct_id(Set<Integer> product_id) {
	this.product_id = product_id;
}



public List<String> getProduct_name() {
	return product_name;
}



public void setProduct_name(List<String> product_name) {
	this.product_name = product_name;
}



public Map<String, Double> getProduct_price() {
	return product_price;
}



public void setProduct_price(Map<String, Double> product_price) {
	this.product_price = product_price;
}

public Properties getUser_name() {
	return user_name;
}


public void setUser_name(Properties user_name) {
	this.user_name = user_name;
}



@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
System.out.println("Init method call :"+this.product_id+" "+this.product_name+" "+this.product_price+" "+this.user_name);
	
}



@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Objects going to destroy for Product class!!!!");
}
}
