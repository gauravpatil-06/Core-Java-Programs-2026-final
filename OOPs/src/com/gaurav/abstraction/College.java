package com.gaurav.abstraction;

public class College extends Student
{
	int getNumber()
	{
		System.out.println("Student ID: "+id);
		return 100;
	}
	
	String getName(String name)
	{
		System.out.println("Student Name: "+name);
		return name;
	}
	
	void display()
	{
		System.out.println("Display Method");
	}
	
	void login(String username, String password)
	{
		System.out.println("Username: "+username);
		System.out.println("password: "+password);
		
	}
	
	public static void main(String[] args) 
	{
		College c1 = new College();
		
		c1.getNumber();
		System.out.println("--------------------");
		
		c1.getName("Gaurav");
		System.out.println("--------------------");		
		
		c1.display();
		System.out.println("--------------------");
		
		c1.login("gauravpatil", "Gaurav@123");
		System.out.println("--------------------");
	}
}
