package com.gaurav.conditionalstatement.nestedif;

import java.util.Scanner;

public class PositiveNegativeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		if(num != 0)
		{
			if(num > 0)
			{
				System.out.println("Number is Positive");
			}
			else
			{
				System.out.println("Number is Negative");
			}
		}
		else
		{
			System.out.println("Number is neither Positive nor Negative");
		}
	}
}