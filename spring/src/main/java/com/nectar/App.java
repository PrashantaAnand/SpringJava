package com.nectar;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        System.out.println( "Hello World!" );
			Student student1 =(Student)context.getBean("student1");
             System.out.println(student1);
       
    }
}
