package com.gaurav.trickyarraysproblem;

import java.util.Scanner;

public class MultiDimensionalArrayEvenNumberAddition 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;

		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();

		int[][] arr = new int[rows][cols];

		System.out.println("\nEnter array elements:");

		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				System.out.print("Enter value at [" + i + "][" + j + "]: ");
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				if(arr[i][j] % 2 == 0)
				{
					sum = sum + arr[i][j];
				}
			}
		}
		
		System.out.println("\nAddition of all even array elements: " + sum);
	}
}