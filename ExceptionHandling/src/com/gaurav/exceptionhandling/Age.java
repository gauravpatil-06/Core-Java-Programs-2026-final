package com.gaurav.exceptionhandling;

public class Age 
{
	void checkAge(int age)
	{
		if(age >= 18)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			throw new AgeNotValidException("You are not eligible for voting");
		}
	}
	
	public static void main(String[] args)
	{
		Age a1 = new Age();
		
		try
		{
			a1.checkAge(16);
		}
		catch(AgeNotValidException e)
		{
			System.out.println(e.getMessage());
		}
	}
}