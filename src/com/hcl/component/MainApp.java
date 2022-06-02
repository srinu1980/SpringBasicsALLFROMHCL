package com.hcl.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("/com/hcl/component/componentconfig.xml");
		Student student=(Student)context.getBean("student",Student.class);

		System.out.println(student);
	}

}
