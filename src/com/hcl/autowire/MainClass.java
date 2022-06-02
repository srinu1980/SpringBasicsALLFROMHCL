package com.hcl.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/hcl/autowire/autowireconfig.xml");
		
		
		Emp emp1=(Emp)context.getBean("emp1",Emp.class);
		
		System.out.println(emp1);
	}

}
