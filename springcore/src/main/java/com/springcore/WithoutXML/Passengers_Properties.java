package com.springcore.WithoutXML;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Properties;

public class Passengers_Properties 
{
	private short Passengers_trainno; 
	private String Passengers_trainname;
	private HashSet<Short> Passengers_id;
	private ArrayList<String> Passengers_Name;
	private LinkedHashMap<Integer, String> Passengers_Pnr_Destination;
	private Properties Passengers_useebase;
	
	
	public void setProperty(short passengers_trainno, String passengers_trainname, HashSet<Short> passengers_id,
			ArrayList<String> passengers_Name, LinkedHashMap<Integer, String> passengers_Pnr_Destination,
			Properties passengers_useebase)
	{
		this.Passengers_trainno = passengers_trainno;
		this.Passengers_trainname = passengers_trainname;
		this.Passengers_id = passengers_id;
		this.Passengers_Name = passengers_Name;
		this.Passengers_Pnr_Destination = passengers_Pnr_Destination;
		this.Passengers_useebase = passengers_useebase;
	}
}
