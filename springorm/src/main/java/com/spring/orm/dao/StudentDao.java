package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	
	
	private HibernateTemplate hibernateTemplate;
	private Serializable studentId;
	
	@Transactional
	public int insert(Student student)
	{
		//insert a data in database using hibernate 
		// here hibernater orm gives hibernate template to store update delete any data to the data base 
		// student Dao calss is used to store any business logic through out the program]
		
		
		// create method in StudentDao class and use it to another parts in program
		
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	
	public Student getStudent(int studentId)
	{   
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	
	public List<Student> getAllStudent()
	{
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	@Transactional
	
	public void deleteStudent(int studentId)
	{
		
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
		
	}
	
	@Transactional
	public void updateStudent(Student sa)
	{
	//	Student s=this.hibernateTemplate.get(Student.class,studentId);
		this.hibernateTemplate.update(sa);

	}
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	
}
