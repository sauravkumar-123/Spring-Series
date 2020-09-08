package com.spring.StereotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp1")
public class Employee {
	@Value("154")
	private int emp_id;
	
	@Value("Saurav Kumar")
	private String emp_name;
	
	@Value("male")
	private String emp_gender;
	
	@Value("krsaurav.097@gmail.com")
	private String emp_email;
	
	@Value("9691098742")
	private long emp_mobno;
	
	@Value("15000.85")
	private double emp_salary;
    
	@Value("#{T(java.lang.Math).sqrt(256)}") //static methods calling.
	private double emp_sqvalue;
	
	@Value("#{T(java.lang.Math).PI}") //static value insert.
	private double emp_pi;
	
	@Value("#{new com.spring.StereotypeAnnotations.Passengers()}") //Object value insert.
	private Passengers emp_pass;
	
	@Value("#{1>0}")  //boolean type insertion.
	private boolean is_Active;
	
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
   
	
	
	public double getEmp_sqvalue() {
		return emp_sqvalue;
	}

	public void setEmp_sqvalue(double emp_sqvalue) {
		this.emp_sqvalue = emp_sqvalue;
	}

	
	public double getEmp_pi() {
		return emp_pi;
	}

	public void setEmp_pi(double emp_pi) {
		this.emp_pi = emp_pi;
	}

	
	
	public Passengers getEmp_pass() {
		return emp_pass;
	}

	public void setEmp_pass(Passengers emp_pass) {
		this.emp_pass = emp_pass;
	}

	
	public boolean isIs_Active() {
		return is_Active;
	}

	public void setIs_Active(boolean is_Active) {
		this.is_Active = is_Active;
	}

	public Employee(int emp_id, String emp_name, String emp_gender, String emp_email, long emp_mobno,
			double emp_salary,double emp_sqvalue,double getEmp_pi,Passengers emp_pass,boolean is_Active) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_gender = emp_gender;
		this.emp_email = emp_email;
		this.emp_mobno = emp_mobno;
		this.emp_salary = emp_salary;
		this.emp_sqvalue=emp_sqvalue;
		this.emp_pi=getEmp_pi;
		this.emp_pass=emp_pass;
		this.is_Active=is_Active;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_gender=" + emp_gender + ", emp_email="
				+ emp_email + ", emp_mobno=" + emp_mobno + ", emp_salary=" + emp_salary + ", emp_sqvalue=" + emp_sqvalue
				+ ", emp_pi=" + emp_pi + ", emp_pass=" + emp_pass + ", is_Active=" + is_Active + "]";
	}

	
	
}
