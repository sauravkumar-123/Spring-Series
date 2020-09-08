package com.springcore.WithoutXML;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Passengers 
{
  private short Passengers_trainno;
 
  private String Passengers_trainname;
 
  private Set<Short> Passengers_id;
 
  private List<String> Passengers_Name;
 
  private Map<Integer,String> Passengers_Pnr_Destination;
 
  private Properties Passengers_useebase;
   
public Passengers() {
	super();
	// TODO Auto-generated constructor stub
}


public Passengers(short Passengers_trainno,String Passengers_trainname,Set<Short> passengers_id, List<String> passengers_Name,
		Map<Integer, String> passengers_Pnr_Destination, Properties passengers_useebase) {
	super();
	this.Passengers_trainno=Passengers_trainno;
	this.Passengers_trainname=Passengers_trainname;
	this.Passengers_id = passengers_id;
	this.Passengers_Name = passengers_Name;
	this.Passengers_Pnr_Destination = passengers_Pnr_Destination;
	this.Passengers_useebase = passengers_useebase;
}




@Override
public String toString() {
	return "Passengers [Passengers_trainno=" + Passengers_trainno + ", Passengers_trainname=" + Passengers_trainname
			+ ", Passengers_id=" + Passengers_id + ", Passengers_Name=" + Passengers_Name
			+ ", Passengers_Pnr_Destination=" + Passengers_Pnr_Destination + ", Passengers_useebase="
			+ Passengers_useebase + "]";
}

/*
@PostConstruct
public void InitMethod()
{
	System.out.println("Init method data : "+this.Passengers_trainno+" "+this.Passengers_Name+" "+this.Passengers_id+" "+this.Passengers_Name+" "+this.Passengers_Pnr_Destination+" "+this.Passengers_useebase);
}

@PreDestroy
public void DestroyMethod()
{
	System.out.println("Object going to destroy!!!!!");
}
*/
}
