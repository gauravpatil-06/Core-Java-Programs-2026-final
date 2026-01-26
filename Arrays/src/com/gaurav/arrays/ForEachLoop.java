package com.gaurav.arrays;

import java.util.Scanner;

public class ForEachLoop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] number = new int[size];
		
		// Taking input using normal for loop
		for(int i = 0; i < size; i++)
		{
			System.out.print("Enter element at index " + i + ": ");
			number[i] = sc.nextInt();
		}
		
		System.out.println("\nArray elements using for-each loop:");
		
		// Printing array using for-each loop
		for(int num : number)
		{
			System.out.println(num);
		}
	}
}