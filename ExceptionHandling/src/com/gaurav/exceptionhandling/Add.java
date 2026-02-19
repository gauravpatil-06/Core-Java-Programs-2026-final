package com.gaurav.exceptionhandling;

public class Add
{
	// Method declaring multiple unchecked exceptions
	void add() throws ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException, NegativeArraySizeException
	{
		int num = 10;

		// This line will cause ArithmeticException (division by zero)
		System.out.println(num / 0);
	}

	public static void main(String[] args)
	{
		Add a1 = new Add();

		try
		{
			a1.add();
		}
		catch(Exception e)
		{
			// Handling all exceptions using parent Exception class
			System.out.println("Exception Occurred: " + e.getMessage());
		}

		System.out.println("Program executed safely after exception handling");
	}
}