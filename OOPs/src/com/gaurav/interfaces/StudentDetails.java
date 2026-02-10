package com.gaurav.interfaces;

public class StudentDetails implements Student
{
	@Override
	public void login()
	{
		System.out.println("Student Login successful");
	}

	@Override
	public void register()
	{
		System.out.println("Student Registration successful");
	}

	public static void main(String[] args)
	{
		StudentDetails s1 = new StudentDetails();

		// Accessing interface constants
		System.out.println("Student ID  : " + Student.id);
		System.out.println("Student Age : " + Student.age);

		// Calling implemented methods
		s1.login();
		s1.register();

		// Calling static method of interface
		Student.display1();

		// Calling default method of interface
		s1.display2();
	}
}