package com.springcore.AutoWiring.Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.springcore.Employee;

public class Department 
{
@Autowired
@Qualifier("dept_emp2")
 private Employee dept_emp;
 
public Department() {
	super();
	// TODO Auto-generated constructor stub
}

//@Autowired
public Department(Employee dept_emp) {
	super();
	this.dept_emp = dept_emp;
	System.out.println("constructor");
}


public Employee getDept_emp() {
	return dept_emp;
}

//@Autowired
public void setDept_emp(Employee dept_emp) {
	this.dept_emp = dept_emp;
	System.out.println("setter method");
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