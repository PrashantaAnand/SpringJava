package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javafx.application.Application;

public class Test {

	public static void main(String[]args) {
		 AbstractApplicationContext context=new ClassPathXmlApplicationContext("lconfig.xml");
		 Prashant p=(Prashant) context.getBean("s1");
		 System.out.println(p);
		 
		 context.registerShutdownHook();
		  
		 Example e1=(Example) context.getBean("e1");
		 System.out.println(e1);
		 
		 
		 
		 
		 
		 
	}
}
