package com.springcore.stereo.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[]args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeconfig.xml");
		                  Student student = (Student) context.getBean("object",Student.class);
		                  
		                  System.out.println(student);
		                  System.out.println(student.getAddress());
		
	}

}
