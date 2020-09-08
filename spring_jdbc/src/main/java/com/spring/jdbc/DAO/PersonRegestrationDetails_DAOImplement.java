package com.spring.jdbc.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.ClassEntity.PersonRegestrationDetails;

@Component("Person_Dao")
public class PersonRegestrationDetails_DAOImplement implements PersonRegestrationDetails_Interface {

	private JdbcTemplate jdbctemp;
	
	@Override
	public int insert(PersonRegestrationDetails pd) {
		// TODO Auto-generated method stub
		
		String qry="insert into "+pd.getTableName()+" (Person_id,Person_name,Person_email,Person_mobno,Person_password) values(?,?,?,?,?)";
		int result=this.jdbctemp.update(qry,pd.getPerson_id(),pd.getPerson_name(),pd.getPerson_email(),pd.getPerson_mobno(),pd.getPerson_password());
		return result;
	}
	
	@Override
	public int update(PersonRegestrationDetails pd) {
		// TODO Auto-generated method stub
		
		String qry="update "+pd.getTableName()+" set Person_email=? , Person_mobno=? , Person_password=? where Person_id=?";
		int result=this.jdbctemp.update(qry,pd.getPerson_email(),pd.getPerson_mobno(),pd.getPerson_password(),pd.getPerson_id());
		return result;
	}

	@Override
	public int delete(PersonRegestrationDetails pd) {
		// TODO Auto-generated method stub
		String qry="delete from "+pd.getTableName()+" WHERE Person_id=? and Person_email=?";
		int result=this.jdbctemp.update(qry,pd.getPerson_id(),pd.getPerson_email());
		return result;
	}
	
	@Override
	public PersonRegestrationDetails select(PersonRegestrationDetails pd) {
		// TODO Auto-generated method stub
	String qry="select * from "+pd.getTableName()+" WHERE Person_id=?";	
	RowMapper<PersonRegestrationDetails> rm=new RowMapperImpl();
	PersonRegestrationDetails pd0=this.jdbctemp.queryForObject(qry, rm,pd.getPerson_id());
	return pd0;
	
	}
	
	@Override
	public List<PersonRegestrationDetails> selectAll() {
		// TODO Auto-generated method stub
		String qry="select * from personregestrationdetails";
		List<PersonRegestrationDetails> listresult=this.jdbctemp.query(qry,new RowMapperImpl());
		return listresult;
	}

	
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	@Autowired
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

	

}
