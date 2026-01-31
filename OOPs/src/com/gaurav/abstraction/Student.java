package com.gaurav.abstraction;

public abstract class Student
{
	int id = 101;
	
	// Hide data for security purpose
	abstract int getNumber();
	
	abstract String getName(String name);
	
	abstract void display();
	
	abstract void login(String username, String password);
}
