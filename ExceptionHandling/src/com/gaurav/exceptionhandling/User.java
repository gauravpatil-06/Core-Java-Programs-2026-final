package com.gaurav.exceptionhandling;

public class User
{
	String getUserById(int number)
	{
		if(number == 1)
		{
			return "Gaurav Patil";
		}
		else if(number == 2)
		{
			return "Vinod Mangate";
		}
		else if(number == 3)
		{
			return "Bhagyesh Bhalerao";
		}
		else
		{
			throw new UserNotFoundException("User not found for ID : " + number);
		}
	}

	public static void main(String[] args)
	{
		User u1 = new User();

		try
		{
			String name = u1.getUserById(4);
			System.out.println("User Name: " + name);
		}
		catch(UserNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}
}