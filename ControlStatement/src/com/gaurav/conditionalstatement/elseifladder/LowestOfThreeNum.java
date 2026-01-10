package com.gaurav.conditionalstatement.elseifladder;

import java.util.Scanner;

public class LowestOfThreeNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		System.out.print("Enter third number: ");
		int num3 = sc.nextInt();

		if(num1 <= num2 && num1 <= num3)
		{
			System.out.println("Lowest Number is: " + num1);
		}
		else if(num2 <= num1 && num2 <= num3)
		{
			System.out.println("Lowest Number is: " + num2);
		}
		else
		{
			System.out.println("Lowest Number is: " + num3);
		}

		sc.close();
	}
}