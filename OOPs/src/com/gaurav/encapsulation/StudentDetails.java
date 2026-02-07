package com.gaurav.encapsulation;

public class StudentDetails
{
	public static void main(String[] args)
	{
		Student s1 = new Student();

		// Setting value using setter
		s1.setId(101);

		// Getting value using getter
		System.out.println("Student ID: " + s1.getId());
	}
}