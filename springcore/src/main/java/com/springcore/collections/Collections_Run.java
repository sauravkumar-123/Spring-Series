package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Employee;

public class Collections_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println( "Data throygh IOC container" );
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/config2.xml");
        context.registerShutdownHook();
        Products pr1=(Products) context.getBean("Products1");
        System.out.println(pr1.getProduct_id()+" "+pr1.getProduct_name()+" "+pr1.getProduct_price());
        System.out.println(pr1.getUser_name());  //properities type element.
        
        
        //Get Accounts_ReferTo_Employee data.
        Employee emp1=(Employee)context.getBean("employee_ref1");
        Accounts_ReferTo_Employee are1=(Accounts_ReferTo_Employee)context.getBean("account_ref1");
        
        Employee emp2=(Employee)context.getBean("employee_ref2");
        Accounts_ReferTo_Employee are2=(Accounts_ReferTo_Employee)context.getBean("account_ref2");
        
        System.out.println("Data of Employee:  "+emp1.getEmp_id()+" "+emp1.getEmp_name()+" "+emp1.getEmp_gender()+" "+emp1.getEmp_email()+" "+emp1.getEmp_mobno()+" "+emp1.getEmp_salary());
        System.out.println("Data of Accounts_ReferTo_Employee:   "+are1.getAccnt_emp().getEmp_id()+" "+are1.getAccnt_emp().getEmp_name()+" "+are1.getAccnt_emp().getEmp_gender()+" "+are1.getAccnt_emp().getEmp_email()+" "+are1.getAccnt_emp().getEmp_mobno()+" "+are1.getAccnt_emp().getEmp_salary());
        System.out.println("Data of Accounts_ReferTo_Employee:  "+are1.getAccnt_id()+" "+are1.getAccnt_type()+" "+are1.getAccnt_Bankname()+" "+are1.getAccnt_balance()+" "+are1.isIs_open());
        
        System.out.println("<--------------------------------------------------------------------------------------->");
        System.out.println("Data of Employee:  "+emp2.getEmp_id()+" "+emp2.getEmp_name()+" "+emp2.getEmp_gender()+" "+emp2.getEmp_email()+" "+emp2.getEmp_mobno()+" "+emp2.getEmp_salary());
        System.out.println("Data of Accounts_ReferTo_Employee:   "+are2.getAccnt_emp().getEmp_id()+" "+are2.getAccnt_emp().getEmp_name()+" "+are2.getAccnt_emp().getEmp_gender()+" "+are2.getAccnt_emp().getEmp_email()+" "+are2.getAccnt_emp().getEmp_mobno()+" "+are2.getAccnt_emp().getEmp_salary());
        System.out.println("Data of Accounts_ReferTo_Employee:  "+are2.getAccnt_id()+" "+are2.getAccnt_type()+" "+are2.getAccnt_Bankname()+" "+are2.getAccnt_balance()+" "+are2.isIs_open());
	}

}
