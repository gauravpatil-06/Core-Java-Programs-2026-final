package com.gaurav.constructor;

public class Student 
{
	// Default Constructor
	Student()
	{
		System.out.println("Student object created using Default Constructor");
	}
	
	// Parameterized Constructor
	Student(String name, int age)
	{
		System.out.println("Student Name : " + name);
		System.out.println("Student Age  : " + age);
	}
	
	public static void main(String[] args) 
	{
		// Calling Default Constructor
		Student s1 = new Student();
		
		System.out.println("--------------------------");
		
		// Calling Parameterized Constructor
		Student s2 = new Student("Gaurav Patil", 19);
	}
}