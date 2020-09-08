package com.springcore.collections;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.springcore.Employee;

public class Accounts_ReferTo_Employee 
{
  private short accnt_id;
  private String accnt_type;
  private String accnt_Bankname;
  private boolean is_open;
  private double accnt_balance;
  private Employee accnt_emp;
  
  
public Accounts_ReferTo_Employee() {
	super();
	// TODO Auto-generated constructor stub
}


public Accounts_ReferTo_Employee(short accnt_id, String accnt_type, String accnt_Bankname, boolean is_open,
		double accnt_balance, Employee accnt_emp) {
	super();
	this.accnt_id = accnt_id;
	this.accnt_type = accnt_type;
	this.accnt_Bankname = accnt_Bankname;
	this.is_open = is_open;
	this.accnt_balance = accnt_balance;
	this.accnt_emp = accnt_emp;
}


public short getAccnt_id() {
	return accnt_id;
}


public void setAccnt_id(short accnt_id) {
	this.accnt_id = accnt_id;
}


public String getAccnt_type() {
	return accnt_type;
}


public void setAccnt_type(String accnt_type) {
	this.accnt_type = accnt_type;
}


public String getAccnt_Bankname() {
	return accnt_Bankname;
}


public void setAccnt_Bankname(String accnt_Bankname) {
	this.accnt_Bankname = accnt_Bankname;
}


public boolean isIs_open() {
	return is_open;
}


public void setIs_open(boolean is_open) {
	this.is_open = is_open;
}


public double getAccnt_balance() {
	return accnt_balance;
}


public void setAccnt_balance(double accnt_balance) {
	this.accnt_balance = accnt_balance;
}


public Employee getAccnt_emp() {
	return accnt_emp;
}


public void setAccnt_emp(Employee accnt_emp) {
	this.accnt_emp = accnt_emp;
}


@Override
public String toString() {
	return "Accounts_ReferTo_Employee [accnt_id=" + accnt_id + ", accnt_type=" + accnt_type + ", accnt_Bankname="
			+ accnt_Bankname + ", is_open=" + is_open + ", accnt_balance=" + accnt_balance + ", accnt_emp=" + accnt_emp
			+ "]";
}
 
@PostConstruct
public void Initmethod()
{
	System.out.println("InitMethod :"+this.accnt_id+" "+this.accnt_type+" "+this.accnt_Bankname+" "+this.accnt_balance+" "+this.is_open+" "+this.accnt_emp);
}

@PreDestroy
public void DestroyMethod()
{
	System.out.println("Objects going to destroy for Accounts_ReferTo_Employee class!!!!");
}
}
