package com.gaurav.accessmodifiers;

public class DefaultAccessModifier 
{
	// Default instance variable
	int id = 101;
	
	// Default constructor
	DefaultAccessModifier()
	{
		System.out.println("DefaultAccessModifier object created");
	}
	
	// Default method
	void display()
	{
		System.out.println("Display method called");
		System.out.println("Student ID: " + id);
	}
}
