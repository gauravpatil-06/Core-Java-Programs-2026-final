package com.gaurav.conditionalstatement.ifstatement;

import java.util.Scanner;

public class StudentMarks 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your marks: ");
		Double marks = sc.nextDouble();
		
		if(marks >= 95)
		{
			System.out.println("Grade: Outstanding");
		}
		
		if(marks < 95 && marks >= 80)
		{
			System.out.println("Grade: Very Good");
		}
		
		if(marks < 80 && marks >= 70)
		{
			System.out.println("Grade: Good");
		}
		
		if(marks < 70 && marks >= 50)
		{
			System.out.println("Grade: Average");
		}
		
		if(marks < 50 && marks >= 35)
		{
			System.out.println("Grade: Poor");
		}
		
		if(marks < 35)
		{
			System.out.println("Result: Fail");
		}
	}
}