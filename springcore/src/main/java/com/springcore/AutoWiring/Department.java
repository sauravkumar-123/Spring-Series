package com.springcore.AutoWiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.springcore.Employee;

public class Department 
{

 private Employee dept_emp;
 
public Department() {
	super();
	// TODO Auto-generated constructor stub
}

public Department(Employee dept_emp) {
	super();
	this.dept_emp = dept_emp;
}


public Employee getDept_emp() {
	return dept_emp;
}

public void setDept_emp(Employee dept_emp) {
	this.dept_emp = dept_emp;
}

@Override
public String toString() {
	return "Department [dept_emp=" + dept_emp + "]";
}

@PostConstruct
public void InitMethod()
{
	System.out.println("Init Method :"+" "+this.dept_emp);
}

@PreDestroy
public void DestroyMethod()
{
	System.out.println("Object going to destroy for class Department!!!!");
}
}