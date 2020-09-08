package com.spring.jdbc.DAO;

import java.util.List;

import com.spring.jdbc.ClassEntity.PersonRegestrationDetails;

public interface PersonRegestrationDetails_Interface {
	
	public int insert(PersonRegestrationDetails pd);
	public int update(PersonRegestrationDetails pd);
	public int delete(PersonRegestrationDetails pd);
	public PersonRegestrationDetails select(PersonRegestrationDetails pd);
	public List<PersonRegestrationDetails> selectAll();

}
