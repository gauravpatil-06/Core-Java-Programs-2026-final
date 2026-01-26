package com.gaurav.arrays;

import java.util.Scanner;

public class SingleDimensionalArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// INTEGER ARRAY
		System.out.print("Enter the size of integer array: ");
		int size = sc.nextInt();

		int[] number = new int[size];

		for(int i = 0; i < size; i++)
		{
			System.out.print("Enter integer value at index " + i + ": ");
			number[i] = sc.nextInt();
		}

		System.out.println("\nInteger Array Elements:");
		for(int i = 0; i < size; i++)
		{
			System.out.println("number[" + i + "] = " + number[i]);
		}

		// STRING ARRAY
		System.out.print("\nEnter the size of string array: ");
		int strSize = sc.nextInt();

		String[] name = new String[strSize];

		for(int i = 0; i < strSize; i++)
		{
			System.out.print("Enter name at index " + i + ": ");
			name[i] = sc.next();
		}

		System.out.println("\nString Array Elements:");
		for(int i = 0; i < strSize; i++)
		{
			System.out.println("name[" + i + "] = " + name[i]);
		}
	}
}