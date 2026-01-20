package com.gaurav.loopingstatement.nestedforloop;

public class StarPattern 
{
	public static void main(String[] args)
	{
		System.out.println("Square Star Pattern\n");
		
		//Square Star Pattern
		for(int i=1; i<=5; i++) //Row
		{
			for(int j=1; j<=5; j++) //Column
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		System.out.println("\nPattern with Different Middle Row\n");
		
		//Pattern with Different Middle Row
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i == 3)
				{
					System.out.print(" # ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("\nMixed Symbol Square Pattern\n");
		
		//Mixed Symbol Square Pattern
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j == 2)
				{
					System.out.print(" % ");
				}
				else if(j == 4)
				{
					System.out.print(" ! ");
				}
				else if(i == 3)
				{
					System.out.print(" # ");
				}
				else if(i == 2)
				{
					System.out.print(" $ ");
				}
				
				else if(i == 4)
				{
					System.out.print(" @ ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}
}