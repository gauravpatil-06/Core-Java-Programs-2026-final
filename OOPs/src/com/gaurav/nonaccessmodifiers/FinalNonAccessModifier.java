package com.gaurav.nonaccessmodifiers;

public final class FinalNonAccessModifier
{
	// Final instance variable
	final int id = 101;
	
	// Final method
	final void display()
	{
		System.out.println("Display method called");
		System.out.println("Student ID: " + id);
	}
	
	final void display(int i)
	{
		System.out.println("---------------------");
		System.out.println("Display method called");
		System.out.println("Student ID: " + i);
	}
}
