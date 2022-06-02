package com.hcl.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/hcl/ref/refconfig.xml");
		
		A temp=(A)context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
	}

}
