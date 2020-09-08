package com.spring.orm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Customer;

public class Customer_Dao {
	
	private HibernateTemplate hibernateTemplate;
	
	//Save data (Table creation and data insertion)
	@Transactional
	public int insert(Customer cust)
	{
		//insert
		
		Integer result=(Integer)this.hibernateTemplate.save(cust);
		return result;
	}

	//get single data.
	public Customer getSingledata(int Customer_id)
	{
		Customer cust=this.hibernateTemplate.get(Customer.class, Customer_id);
		return cust;
	}
	
	//get multiple data.
	public List<Customer> getAlldata(){
		
		ArrayList<Customer> alist=(ArrayList<Customer>) this.hibernateTemplate.loadAll(Customer.class);
		return alist;
	}
	
	//delete data
	@Transactional
	public void deleteData(int Customer_id)
	{
		Customer cust=this.hibernateTemplate.get(Customer.class,Customer_id);
		try {
			
		this.hibernateTemplate.delete(cust);
		System.out.println(Customer_id+"=>data deleted successfully!!!");
		}
		catch(Exception e)
		{
		  System.out.println("data not deleted successfully!!!");	
		}
		
	}
	
	//update data
	@Transactional
	public void UpdateData(Customer cust)
	{
		try {
			//Customer cust_demo=this.hibernateTemplate.
		this.hibernateTemplate.update(cust);
		}catch(Exception e)
		{
			 System.out.println("data not Updated successfully!!!");
		}
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
