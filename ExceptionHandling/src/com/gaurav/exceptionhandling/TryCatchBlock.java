package com.gaurav.exceptionhandling;

public class TryCatchBlock 
{
	public static void main(String[] args) 
	{

		/* 
		 * -------------------------------
		 * EXAMPLE 1: Multiple catch blocks
		 * -------------------------------
		 * Each catch handles a specific exception separately
		 */
		
//		try
//		{
//			// ArithmeticException: divide by zero
//			System.out.println(10/0);
//			
//			// NullPointerException: calling method on null object
//			String name = "Gaurav Patil";
//			name = null;
//			System.out.println(name.toUpperCase());
//			
//			// ArrayIndexOutOfBoundsException: accessing invalid index
//			int arr[] = {10,20,30,40,50};
//			System.out.println(arr[10]);
//		
//			// ArrayIndexOutOfBoundsException: negative index
//			int arr1[] = {10,20,30,40,50};
//			System.out.println(arr1[-1]);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(NegativeArraySizeException e)
//		{
//			// This would catch if we did `new int[-5]`
//			System.out.println(e.getMessage());
//		}
		
		
		/*
		 * -----------------------------------------
		 * EXAMPLE 2: Multi-catch block (Java 7+)
		 * -----------------------------------------
		 * Multiple exceptions handled in a single catch
		 */
		
//		try
//		{
//			System.out.println(10/0);
//			
//			String name = "Gaurav Patil";
//			name = null;
//			System.out.println(name.toUpperCase());
//			
//			int arr[] = {10,20,30,40,50};
//			System.out.println(arr[10]);
//			
//			int arr1[] = {10,20,30,40,50};
//			System.out.println(arr1[-1]);
//		}
//		catch(ArithmeticException | NullPointerException |
//		      ArrayIndexOutOfBoundsException | NegativeArraySizeException e)
//		{
//			System.out.println(e.getMessage());
//		}
		
		
		/*
		 * -----------------------------------------
		 * EXAMPLE 3: Generic Exception handling
		 * -----------------------------------------
		 * Parent class Exception handles all runtime exceptions
		 */
		
		try
		{
			// ArithmeticException
			System.out.println(10/0);
			
			// NullPointerException
			String name = "Gaurav Patil";
			name = null;
			System.out.println(name.toUpperCase());
			
			// ArrayIndexOutOfBoundsException
			int arr[] = {10,20,30,40,50};
			System.out.println(arr[10]);
			
			// ArrayIndexOutOfBoundsException (negative index)
			int num[] = {10,20,30,40,50};
			System.out.println(num[-1]);
		}
		catch(Exception e)
		{
			// Handles all types of exceptions
			System.out.println(e.getMessage());
		}
	}
}