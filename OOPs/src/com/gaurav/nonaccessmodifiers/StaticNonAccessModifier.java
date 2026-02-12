package com.gaurav.nonaccessmodifiers;

public class StaticNonAccessModifier 
{
	// Static instance variable
	static String collegeName = "DYPCOE";
	
	// Static method
	static void student1()
	{
		System.out.println("Student 1 Method called");
		System.out.println("College Name: " + collegeName);
	}
	
	static void student2()
	{
		System.out.println("Student 2 Method called");
		System.out.println("College Name: " + collegeName);
	}
	
	public static void main(String[] args) 
	{
		StaticNonAccessModifier s1 = new StaticNonAccessModifier();
		s1.student1();
		System.out.println("-----------------------");
		s1.student2();
		
		
	}
}
