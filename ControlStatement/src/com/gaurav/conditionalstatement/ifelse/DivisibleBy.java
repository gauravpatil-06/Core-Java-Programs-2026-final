package com.gaurav.conditionalstatement.ifelse;

import java.util.Scanner;

public class DivisibleBy 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		if(num % 3 == 0 && num % 5 == 0)
		{
			System.out.println("Number is divisible by 3 and 5");
		}
		else
		{
			System.out.println("Number is not divisible by 3 and 5");
		}
	}
}