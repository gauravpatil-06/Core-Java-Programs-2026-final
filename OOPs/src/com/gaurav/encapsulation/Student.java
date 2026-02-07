package com.gaurav.encapsulation;

public class Student
{
	// Private data member (Data Hiding)
	private int id;

	// Getter method to access student ID
	public int getId()
	{
		return id;
	}

	// Setter method to set student ID with validation
	public void setId(int id)
	{
		if(id > 0)
		{
			this.id = id;
		}
		else
		{
			System.out.println("Please enter a valid Student ID");
		}
	}
}