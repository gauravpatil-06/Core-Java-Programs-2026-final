package com.gaurav.nonaccessmodifiers;

public class FinalNonAccessModifiers
{
	void display()
	{
		System.out.println("Display method called");
		System.out.println("Student ID: " + id);
	}
	
	public static void main(String[] args) 
	{
		FinalNonAccessModifier f1 = new FinalNonAccessModifier();
		f1.display();
		f1.display(102);
	}
}
