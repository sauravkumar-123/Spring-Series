package com.spring.orm;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.Customer_Dao;
import com.spring.orm.entities.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
	private static String string_Customer_id;
	private static String string_Customer_mobno;
	
	private static int Customer_id;
	private static String Customer_name;
	private static String Customer_email;
	private static long Customer_mobno;
	private static String Customer_location;
	
    public static void main( String[] args )
    {
        System.out.println( "Spring ORM ProjectStart......>" );
        Scanner scan=new Scanner(System.in);
        System.out.println("enter Customer_id,Customer_name,Customer_email,Customer_mobno and Customer_location");
        string_Customer_id=scan.nextLine();
        Customer_id=Integer.parseInt(string_Customer_id);
        
        Customer_name=scan.nextLine();
        Customer_email=scan.nextLine();
        
        string_Customer_mobno=scan.nextLine();
        Customer_mobno=Long.parseLong(string_Customer_mobno);
        
        Customer_location=scan.nextLine();
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config1.xml");
        Customer_Dao cdao=context.getBean("Customer_dao",Customer_Dao.class);
        
        Customer cust=new Customer();
        cust.setCustomer_id(Customer_id);
        cust.setCustomer_name(Customer_name);
        cust.setCustomer_email(Customer_email);
        cust.setCustomer_mobno(Customer_mobno);
        cust.setCustomer_location(Customer_location);
        
        int result=cdao.insert(cust);
        System.out.println("Customer_id=>"+result+" inserted successfully!!!!");
        
        System.out.println("enter...Customer_id for get single Customer data");
        string_Customer_id=scan.nextLine();
        Customer_id=Integer.parseInt(string_Customer_id);
        
        //Customer cust1=new Customer();
        //cust.setCustomer_id(Customer_id);
        
        Customer cresult=cdao.getSingledata(Customer_id);
        System.out.println("Customer_id="+Customer_id+"and its data is"+cresult.toString());
        
        ArrayList<Customer> alist=(ArrayList<Customer>) cdao.getAlldata();
        System.out.println("All Customer data ="+alist.toString());
        
        System.out.println("enter...Customer_id for delete Customer data");
        string_Customer_id=scan.nextLine();
        Customer_id=Integer.parseInt(string_Customer_id);
        
        cdao.deleteData(Customer_id);
        
        System.out.println("enter...Customer_id for update data");
        string_Customer_id=scan.nextLine();
        Customer_id=Integer.parseInt(string_Customer_id);
        
        
        Customer cust1=new Customer();
        cust1.setCustomer_id(Customer_id);
        cust1.setCustomer_name(Customer_name);
        cust1.setCustomer_email(Customer_email);
        cust1.setCustomer_mobno(Customer_mobno);
        cust1.setCustomer_location(Customer_location);
         cdao.UpdateData(cust1);
    }
}
