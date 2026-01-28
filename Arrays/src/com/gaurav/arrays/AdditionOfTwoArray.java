package com.gaurav.arrays;

import java.util.Scanner;

public class AdditionOfTwoArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("Enter the size of the arrays: ");
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		int arr3[] = new int[size];
		
		// Taking input for first array
		System.out.println("\nEnter elements of First Array:");
		for(int i = 0; i < size; i++)
		{
			System.out.print("Index " + i + ": ");
			arr1[i] = sc.nextInt();
		}
		
		// Taking input for second array
		System.out.println("\nEnter elements of Second Array:");
		for(int i = 0; i < size; i++)
		{
			System.out.print("Index " + i + ": ");
			arr2[i] = sc.nextInt();
		}
		
		// Adding both arrays
		System.out.println("\nAddition of Corresponding Elements:");
		for(int i = 0; i < size; i++)
		{
			arr3[i] = arr1[i] + arr2[i];
			sum = sum + arr3[i];
			System.out.println("arr1[" + i + "] + arr2[" + i + "] = " + arr3[i]);
		}
		
		System.out.println("\nFinal Sum of All Elements of Third Array: " + sum);
	}
}