package com.spring.jdbc;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.ClassEntity.PersonRegestrationDetails;
import com.spring.jdbc.DAO.PersonRegestrationDetails_DAOImplement;
import com.spring.jdbc.DAO.PersonRegestrationDetails_Interface;

/**
 * Hello world!
 *
 */
public class App 
{
	private static String TableName;
	
    private static String string_Person_id;
	private static int Person_id;
	
	private static String Person_name;
	private static String Person_email;
	
	private static String string_Person_mobno;
	private static long Person_mobno;
	
	private static String Person_password;
	
	private static String Received_Data;

    public static void main( String[] args )
    { 
    	Scanner scan=new Scanner(System.in);
    	System.out.println("enter Table name");
    	TableName=scan.nextLine();
    	
    	System.out.println("enter Person_id,Person_name,Person_email,Person_mobno and Person_password");
    	
    	string_Person_id=scan.nextLine();
    	Person_id=Integer.parseInt(string_Person_id);
    	
    	Person_name=scan.nextLine();
    	Person_email=scan.nextLine();
    	
    	string_Person_mobno=scan.nextLine();
    	Person_mobno=Long.parseLong(string_Person_mobno);
    	
    	Person_password=scan.nextLine();
    
        System.out.println( "Spring JDBC start.......>" );
        
        //spring jdbc-->jdbcTemplete class
       
        //ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config1.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigWithoutXML.class);
        /*
        JdbcTemplate jtemp=context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //Query
        String qry="insert into "+TableName+" (Person_id,Person_name,Person_email,Person_mobno,Person_password) values(?,?,?,?,?)";
        int result=jtemp.update(qry,Person_id,Person_name,Person_email,Person_mobno,Person_password);*/
        
        PersonRegestrationDetails_Interface obj=context.getBean("Person_Dao",PersonRegestrationDetails_Interface.class);
   
        PersonRegestrationDetails pd=new PersonRegestrationDetails();
        pd.setTableName(TableName);
        pd.setPerson_id(Person_id);
        pd.setPerson_name(Person_name);
        pd.setPerson_email(Person_email);
        pd.setPerson_mobno(Person_mobno);
        pd.setPerson_password(Person_password);
        
       int result=obj.insert(pd);
        
       System.out.println("Person Details==>"+pd.toString());
       System.out.println(result+"row inserted sucessfully....");
        
       
       System.out.println("Do You want to update Person_email,Person_mobno and Person_password YES/NO");
       Received_Data=scan.nextLine();
      
       if(Received_Data.equals("YES")||Received_Data.equals("yes"))
       {
    	   
    	   System.out.println("enter Table name");
       	   TableName=scan.nextLine();
       	   
        System.out.println("enter Person_id,Person_email,Person_mobno and Person_password");
    	
    	string_Person_id=scan.nextLine();
    	Person_id=Integer.parseInt(string_Person_id);
    	
    	Person_email=scan.nextLine();
    	
    	string_Person_mobno=scan.nextLine();
    	Person_mobno=Long.parseLong(string_Person_mobno);
    	
    	Person_password=scan.nextLine();
    	
    	PersonRegestrationDetails pd1=new PersonRegestrationDetails();
    	pd1.setTableName(TableName);
    	pd1.setPerson_id(Person_id);
    	pd1.setPerson_email(Person_email);
    	pd1.setPerson_mobno(Person_mobno);
    	pd1.setPerson_password(Person_password);
    	
    	int result1=obj.update(pd1);
    	System.out.println(result1+"row updated sucessfully");
       }
       else {
    	   System.out.println("OK!! THANKU...");
       }
       
       System.out.println("Do You want to Delete any Person data|| YES/NO");
       Received_Data=scan.nextLine();
       
       if(Received_Data.equals("yes")||Received_Data.equals("YES"))
       {
           
           System.out.println("enter Table name");
       	   TableName=scan.nextLine();

           System.out.println("enter Person_id and Person_email");
           
           string_Person_id=scan.nextLine();
       	   Person_id=Integer.parseInt(string_Person_id);
       	
       	   Person_email=scan.nextLine();
       	   
       	PersonRegestrationDetails pd2=new PersonRegestrationDetails();
    	pd2.setTableName(TableName);
    	pd2.setPerson_id(Person_id);
    	pd2.setPerson_email(Person_email);
        
    	int result2=obj.delete(pd2);
    	System.out.println(result2+"row deleted successfully");
       }
       else {
    	   System.out.println("OK!! THANKU...");
       }
       
       System.out.println("Do You want fetch Person data|| YES/NO");
       Received_Data=scan.nextLine();
       if(Received_Data.equals("yes")||Received_Data.equals("YES"))
       {
    	   System.out.println("enter Table name");
       	   TableName=scan.nextLine();
       	   
          System.out.println("enter Person_id");
        
          string_Person_id=scan.nextLine();
    	  Person_id=Integer.parseInt(string_Person_id);	
    	  PersonRegestrationDetails pd3=new PersonRegestrationDetails();
      	  pd3.setTableName(TableName);
      	  pd3.setPerson_id(Person_id);
      	
      	  
    	  PersonRegestrationDetails result3=obj.select(pd3);
      	 System.out.println("Data==>"+result3);
       }
       else {
    	   System.out.println("OK!! THANKU...");
       }
      
       List<PersonRegestrationDetails> listresult=obj.selectAll();
       
       ListIterator<PersonRegestrationDetails> ltr = listresult.listIterator();
       while (ltr.hasNext()) 
       { 
    	   PersonRegestrationDetails ps= (PersonRegestrationDetails) ltr.next();   
    	   System.out.println(ps);
       }
       
       }
    }
