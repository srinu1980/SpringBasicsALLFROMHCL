package com.hcl.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {


		ApplicationContext context=new ClassPathXmlApplicationContext("com/hcl/ci/personconfig.xml");
		
		Person p=(Person)context.getBean("personBean2");
		
		System.out.println(p);  //calling  toString()
	
		
		Person p3=(Person)context.getBean("personBean3");
		System.out.println(p3);  //calling  toString()
		
	}

}
