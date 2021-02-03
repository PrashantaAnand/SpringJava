package com.spring.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configurable
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class JdbcConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}

	 @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate(){
    	JdbcTemplate jdbcTemplate = new JdbcTemplate();
    	jdbcTemplate.setDataSource(getDataSource());
    	return jdbcTemplate;
    	
    }
//	 @Bean("studentDao")
//	 public StudentDao getStudentDao() {
//		 StudentDaoImpl studentDao = new StudentDaoImpl() ;
//			studentDao.setJdbcTemplate(getTemplate());
//			return studentDao;
//			
//	 }
	 


}
