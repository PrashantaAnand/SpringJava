package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);


//       3218 4464 5686 
//        Student student=new Student(221,"prashanat","pune");
//        int r =studentDao.insert(student);
//        System.out.println("done " +r);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean go =true;
        while(go)
        {
        	System.out.println("press 1 for add new student");
        	System.out.println("press 2 for display all student");
        	System.out.println("press 3 for for get details of single student");
        	System.out.println("press 4 for delete students");
        	System.out.println("press 5 for update student");
        	System.out.println("press 6 for EXIT");
        
        	try {
        		int input = Integer.parseInt(br.readLine());
        		
        		switch (input) {
				case 1:
					//add a new student
					//taking input from users
					System.out.println("Enter user id :");
					int uId = Integer.parseInt(br.readLine());
					
					System.out.println("Enter user name :");
					String uName = br.readLine();
					
					System.out.println("Enter user city :");
					String uCity = br.readLine();
					
					//creating student object and seting values
					Student s =new Student();
					s.setStudentId(uId);
					s.setStudentName(uName);
					s.setStudentCity(uCity);
					
					//saving student object to db by calling insert method
					int r = studentDao.insert(s);
					System.out.println(r + "student added");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					
					break;
					
                 case 2:
					//display all record
                	 System.out.println("*********************************************");
                	 List<Student> allStudents = studentDao.getAllStudent();
                	 for(Student st:allStudents)
                	 {
                		 System.out.println("Name : "+st.getStudentName());
                		 System.out.println("Id : "+st.getStudentId());
                		 System.out.println("CIty : "+st.getStudentCity());
                		 System.out.println("***********************************************");
                	 }
					break;
					
                 case 3:
                	 //get single record
                	 System.out.println("Enter user id :");
 					int userId = Integer.parseInt(br.readLine());
               	               System.out.println("***********************************************");

 					             Student student = studentDao.getStudent(userId);
 					            System.out.println("Name : "+student.getStudentName());
 		                		 System.out.println("Id : "+student.getStudentId());
 		                		 System.out.println("CIty : "+student.getStudentCity());
 		                		 System.out.println("***********************************************");
 					
                	 break;
                	 
                 case 4:
                	 //delete
                	 System.out.println("Enter user id :");
  					int id = Integer.parseInt(br.readLine());
  					  studentDao.deleteStudent(id);
  					  System.out.println("student deleted");
                	 break;
                	 
                 case 5:
                	 //update 
//                	 System.out.println("Enter user id :");
//   					int ide = Integer.parseInt(br.readLine());
//   				   		
//   					
   				 System.out.println("Enter user id :");
					int usId = Integer.parseInt(br.readLine());
            	               System.out.println("***********************************************");

					             Student student1 = studentDao.getStudent(usId);
            

					System.out.println("Enter new user name :");
					String Name = br.readLine();
					
					System.out.println("Enter new user city :");
					String City = br.readLine();
					
				
					student1.setStudentName(Name);
					student1.setStudentCity(City);

					System.out.println("Set data2");
				
					studentDao.updateStudent(student1);
					
					System.out.println("student updated");
                	 break;

                 case 6:
                	 //exit
                	 go = false;
                	 break;
                	 
				default:
					System.out.println("reENTER");
					break;
				}
        	}catch (Exception e) {
				System.out.println("invalid INput try with another one!!!!");
				System.out.println(e.getMessage());
			}
        	
        	 
        }
        
        System.out.println("Thanks for visiting my applicATION ");
        System.out.println("use it twice~~~~!!!!!!!");
        
        
        
        
    }
}
