package com.springcore.ConstructorInjuction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Properties;

import com.springcore.collections.Accounts_ReferTo_Employee;

public class Person
{
  private short person_id;
  private String person_name;
  private String person_email;
  
  private ArrayList<String> person_skill;
  private LinkedHashSet<Long> person_mobno;
  private HashMap<Short,String> person_keypair;
  private Properties Person_userbase;
  
  private Accounts_ReferTo_Employee Person_accref;
  
 
public Person(short person_id, String person_name, String person_email, ArrayList<String> person_skill,
		LinkedHashSet<Long> person_mobno, HashMap<Short, String> person_keypair, Properties person_userbase,
		Accounts_ReferTo_Employee person_accref)
{
	//super();
	System.out.println("all objects constructor");
	
	this.person_id = person_id;
	this.person_name = person_name;
	this.person_email = person_email;
	this.person_skill = person_skill;
	this.person_mobno = person_mobno;
	this.person_keypair = person_keypair;
	this.Person_userbase = person_userbase;
	this.Person_accref = person_accref;	
}



public Person(String person_name, Accounts_ReferTo_Employee person_accref) {
	super();
	System.out.println("name and accref constructor");
	this.person_name = person_name;
	this.Person_accref = person_accref;
}



public Person(String person_email,short person_id,Properties person_userbase,HashMap<Short, String> person_keypair,
		Accounts_ReferTo_Employee person_accref) 
{
	//super();
	System.out.println("email,id,userbase,keypair and accref constructor");
	this.person_email = person_email;
	this.person_id = person_id;
	this.Person_userbase = person_userbase;
	this.person_keypair = person_keypair;
	this.Person_accref = person_accref;
}



@Override
public String toString() {
	return "Person [person_id=" + person_id + ", person_name=" + person_name + ", person_email=" + person_email
			+ ", person_skill=" + person_skill + ", person_mobno=" + person_mobno + ", person_keypair=" + person_keypair
			+ ", Person_userbase=" + Person_userbase + ", Person_accref=" + Person_accref + "]";
}

public void InitMethod()
{
	System.out.println("Initlization data :"+this.person_id+" "+this.person_name+" "+this.person_email+" "+this.person_skill+" "+this.person_mobno+" "+this.person_keypair+" "+this.Person_userbase+" "+this.Person_accref);
}

/*
public void display()
{
	System.out.println("constructor data :"+this.person_id+" "+this.person_name+" "+this.person_email+" "+this.person_skill+" "+this.person_mobno+" "+this.person_keypair+" "+this.Person_userbase+" "+this.Person_accref);
}
*/
public void DestoryMethod()
{
	System.out.println("Objects going to destroy!!!!->");
}
}
