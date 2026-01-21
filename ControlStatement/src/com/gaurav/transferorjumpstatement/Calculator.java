package com.gaurav.transferorjumpstatement;

import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========== SIMPLE CALCULATOR ==========\n");
		
		System.out.println("Select Operation");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		
		System.out.print("\nSelect Operation: ");
		int choice = sc.nextInt();
		
		System.out.print("\nEnter First Number: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Enter Second Number: ");
		double num2 = sc.nextDouble();
		
		switch(choice)
		{
			case 1:
				System.out.println("\nResult = " + (num1 + num2));
				break;
				
			case 2:
				System.out.println("\nResult = " + (num1 - num2));
				break;
				
			case 3:
				System.out.println("\nResult = " + (num1 * num2));
				break;
				
			case 4:
				if(num2 != 0)
				{
					System.out.println("\nResult = " + (num1 / num2));
				}
				else
				{
					System.out.println("\nError: Division by zero is not allowed");
				}
				break;
				
			default:
				System.out.println("\nInvalid operation selected");
		}
		
		System.out.println("\n======================================");
	}
}