package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {


		ApplicationContext context=new ClassPathXmlApplicationContext("/com/hcl/collections/collectionconfig.xml");
		
		Student s=(Student)context.getBean("studentBean");
		
		System.out.println("Student Id :"+s.getStudentId());
		System.out.println("Student Name :"+s.getStudentName());
		System.out.println("Student Address :"+s.getStudentAddress());
		
		
Student s2=(Student)context.getBean("studentBean2");
		
		System.out.println("Student Id :"+s2.getStudentId());
		System.out.println("Student Name :"+s2.getStudentName());
		System.out.println("Student Address :"+s2.getStudentAddress());
		
		
		
	}

}
