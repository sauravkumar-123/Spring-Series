package com.springcore;

public class Employee 
{
  private int emp_id;
  private String emp_name;
  private String emp_gender;
  private String emp_email;
  private long emp_mobno;
  private double emp_salary;
  
  
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	System.out.println("settings employee id");
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	System.out.println("settings employee name");
	this.emp_name = emp_name;
}
public String getEmp_gender() {
	return emp_gender;
}
public void setEmp_gender(String emp_gender) {
	System.out.println("settings employee gender");
	this.emp_gender = emp_gender;
}
public String getEmp_email() {
	return emp_email;
}
public void setEmp_email(String emp_email) {
	System.out.println("settings employee email");
	this.emp_email = emp_email;
}
public long getEmp_mobno() {
	return emp_mobno;
}
public void setEmp_mobno(long emp_mobno) {
	System.out.println("settings employee mobileno");
	this.emp_mobno = emp_mobno;
}
public double getEmp_salary() {
	return emp_salary;
}
public void setEmp_salary(double emp_salary) {
	System.out.println("settings employee salary");
	this.emp_salary = emp_salary;
}
public Employee(int emp_id, String emp_name, String emp_gender, String emp_email, long emp_mobno, double emp_salary) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.emp_gender = emp_gender;
	this.emp_email = emp_email;
	this.emp_mobno = emp_mobno;
	this.emp_salary = emp_salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_gender=" + emp_gender + ", emp_email="
			+ emp_email + ", emp_mobno=" + emp_mobno + ", emp_salary=" + emp_salary + "]";
}
  

  
}
