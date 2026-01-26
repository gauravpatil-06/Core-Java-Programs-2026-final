package com.gaurav.arrays;

public class EvenNumber
{
	public static void main(String[] args)
	{
		// EVEN NUMBERS FROM ARRAY
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Even numbers from the array:");
		for(int i : number)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("----------------------------------");
		
		// POSITIVE NUMBERS FROM ARRAY
		int[] num = {1,2,-3,-4,5,6,-7,-8,-9,10};
		
		System.out.println("Positive numbers from the array:");
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] > 0)
			{
				System.out.println(num[i]);
			}
		}
	}
}