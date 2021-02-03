package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {  
public static void main(String[] args) {  
	
	System.out.println("hello world");
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");

		Student student1 =(Student)context.getBean("student1");
         System.out.println(student1);
    student1.displayInfo();  
}  
}  
