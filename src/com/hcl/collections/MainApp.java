package com.hcl.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/hcl/collections/collectionconfig.xml");
		
		Emp e=(Emp) context.getBean("collectionBean");
		
		System.out.println(e.getName());
		System.out.println(e.getPhones());
		System.out.println(e.getCourses());
		System.out.println(e.getAddresses());
		
	}

}
