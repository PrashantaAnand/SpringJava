package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "spring jdbc started...................." );

        //spring jdbc templete
        
        ApplicationContext context=
        		new AnnotationConfigApplicationContext(JdbcConfig.class);
       
        StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
        
//       insert
//		Student student = new Student();
//		student.setId(229);
//		student.setName("prashant Sinha");
//		student.setCity("Patna");
//
//		int result = studentDao.insert(student);
//		System.out.println("student added" + result);

//      update
//        Student student=new Student();
//        student.setId(333);
//        student.setName("Sohan");
//        student.setCity("Mumbai");
//        
//        int result = studentDao.change(student);
//        
//        System.out.println("student added"+result);
        
       //delete
//        int result = studentDao.delete(333);
//        System.out.println("deleted"+result);
//        
//       single data fetch from database
//        Student student1 = studentDao.getStudent(111);
//        System.out.println(student1);
//        
        List<Student> students = studentDao.getAllStudents();
        for(Student s: students) {
        	System.out.println(s);
        }
        
    
    }
}
