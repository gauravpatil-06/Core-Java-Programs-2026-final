package com.gaurav.loopingstatement.whileloop;

public class EvenOddNumber 
{
	public static void main(String[] args)
	{
		System.out.println("Even Number\n");
		
		int i=1;
		while(i <= 10)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("\nOdd Number\n");
		
		int j=1;
		while(j <= 10)
		{
			if(j % 2 == 1)
			{
				System.out.println(j);
			}
			j++;
		}
		
	}
}
