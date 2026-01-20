package com.gaurav.loopingstatement.nestedwhileloop;

public class StarPattern 
{
	public static void main(String[] args) 
	{
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=5)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}