package com.spring.jdbc.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.ClassEntity.PersonRegestrationDetails;

public class RowMapperImpl implements RowMapper<PersonRegestrationDetails> {

	@Override
	public PersonRegestrationDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		PersonRegestrationDetails pd=new PersonRegestrationDetails();
		pd.setTableName(rs.getString(1));
		pd.setPerson_id(rs.getInt(2));
		pd.setPerson_name(rs.getString(3));
		pd.setPerson_email(rs.getString(4));
		pd.setPerson_mobno(rs.getLong(5));
		pd.setPerson_password(rs.getString(6));
		return pd;
	}

}
