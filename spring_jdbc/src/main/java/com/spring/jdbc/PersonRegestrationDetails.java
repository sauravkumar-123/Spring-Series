package com.spring.jdbc;

public class PersonRegestrationDetails
{
private int Person_id;
private String Person_name;
private String Person_email;
private long Person_mobno;
private String Person_password;


public PersonRegestrationDetails() {
	super();
	// TODO Auto-generated constructor stub
}


public PersonRegestrationDetails(int Person_id,String person_name, String person_email, long person_mobno, String person_password) {
	super();
	this.Person_id=Person_id;
	this.Person_name = person_name;
	this.Person_email = person_email;
	this.Person_mobno = person_mobno;
	this.Person_password = person_password;
}



public int getPerson_id() {
	return Person_id;
}


public void setPerson_id(int person_id) {
	Person_id = person_id;
}


public String getPerson_name() {
	return Person_name;
}


public void setPerson_name(String person_name) {
	Person_name = person_name;
}


public String getPerson_email() {
	return Person_email;
}


public void setPerson_email(String person_email) {
	Person_email = person_email;
}


public long getPerson_mobno() {
	return Person_mobno;
}


public void setPerson_mobno(long person_mobno) {
	Person_mobno = person_mobno;
}


public String getPerson_password() {
	return Person_password;
}


public void setPerson_password(String person_password) {
	Person_password = person_password;
}

@Override
public String toString() {
	return "PersonRegestrationDetails [Person_id=" + Person_id + ", Person_name=" + Person_name + ", Person_email="
			+ Person_email + ", Person_mobno=" + Person_mobno + ", Person_password=" + Person_password + "]";
}


}
