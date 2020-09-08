package com.springMVC.Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springMVC.Model.StudentDetail;

@Repository
public class StudentDetailDao {

	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public int saveStudentDetail(StudentDetail sd)
	{
		//insert Student data.
		
		Integer result=(Integer)this.hibernateTemplate.save(sd);
		return result;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
