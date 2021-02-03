package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentID);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();

}
