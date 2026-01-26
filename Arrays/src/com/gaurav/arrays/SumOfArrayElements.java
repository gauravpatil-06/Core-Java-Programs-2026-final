package com.gaurav.arrays;

import java.util.Scanner;

public class SumOfArrayElements
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] number = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			System.out.print("Enter element at index " + i + ": ");
			number[i] = sc.nextInt();
		}
		
		for(int i : number)
		{
			sum = sum + i;
		}
		
		System.out.println("\nSum of array elements: " + sum);
	}
}