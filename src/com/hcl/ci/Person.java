package com.hcl.ci;

public class Person 
{

	private int pId;
	private String name;
	
	public Person(int pId, String name) 
	{
		
		this.pId = pId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person pId=" + pId + ", name=" + name ;
	}
	
	
	
}
