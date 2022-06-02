package com.hcl.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/hcl/springjdbc/springjdbcconfig.xml");
		
		UserDao udao=(UserDao)context.getBean("edao");
		
		//int status=udao.SaveUser(new User(200, "Kartic", 80000));
		
		//System.out.println(status);
		
		//delete
		
		User user=new User();
		user.setId(200);
		
	//    int status=udao.deleteUser(user); 
	  //  System.out.println("Deleted Record status :"+status);  
	   
		
		//update
		
	    int status=udao.updateUser(new User(100,"Mahi",15000)); 
	    System.out.println(status); 
		
		
	}

}
