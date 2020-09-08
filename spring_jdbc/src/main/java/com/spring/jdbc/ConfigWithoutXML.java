package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.DAO.PersonRegestrationDetails_DAOImplement;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.DAO"})
public class ConfigWithoutXML {

@Bean(name= {"ds"})
public DataSource getDataSource()
{
	DriverManagerDataSource ds=new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
	ds.setUsername("root");
	ds.setPassword("12345");
	return ds;
}

@Bean(name= {"jdbcTemplate"})
public JdbcTemplate getTemplate()
{
 JdbcTemplate jdbctemp=new JdbcTemplate();
 jdbctemp.setDataSource(getDataSource());
return jdbctemp;
 
}
/*
@Bean(name= {"Person_Dao"})
public PersonRegestrationDetails_DAOImplement getDAO()
{
	PersonRegestrationDetails_DAOImplement pdao=new PersonRegestrationDetails_DAOImplement();
	pdao.setJdbctemp(getTemplate());
	return pdao;	
}*/
}
