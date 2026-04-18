package com.gaurav.trickyarraysproblem;

import java.util.Scanner;

public class AdditionOfOddArrayElements 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;

		System.out.print("Enter the size of integer array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for(int i = 0; i < size; i++)
		{
			System.out.print("Enter element at index " + i + ": ");
			arr[i] = sc.nextInt();
		}

		// Calculating sum of odd array elements
		for(int i : arr)
		{
			if(i % 2 == 1)
			{
				sum = sum + i;
			}
		}
		
		System.out.println("\nAddition of Odd Array Elements: " + sum);
	}
}