package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.Student;

@Component("studentDao")

public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		//MAIN CODE
		 String query="insert into student(id,name,city) values(?,?,?)";
		 int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return r;
	}

	public int change(Student student) {
		//update
		String query ="update student set name=? , city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	public int delete(int studentID) {
		//delete
		String query ="delete from student where id=?";
		
		int r = this.jdbcTemplate.update(query,studentID);
		
		return r;
	}

	public Student getStudent(int studentId) {
		//selecting single student
		String query="select * from student where id=?";
        
	    RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student= this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		
		
		return student;
	}
	
	public List<Student> getAllStudents() {
		//select multiple data from database
		String query="select * from student";
		List<Student> student = this.jdbcTemplate.query(query,new RowMapperImpl());
		
		return student;
	}

	


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


}
