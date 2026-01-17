package com.gaurav.loopingstatement.dowhileloop;

public class AllStarPattern 
{
	public static void main(String[] args)
	{
		System.out.println("Square Star Pattern\n");
		
		// Square Star Pattern
		int i = 1;
		do
		{
			int j = 1;
			do
			{
				System.out.print("* ");
				j++;
			} while(j <= 5);
			
			System.out.println();
			i++;
		} while(i <= 5);

		System.out.println("\n-----------------------------");
		System.out.println("Row Number Pattern\n");
		
		// Row Number Pattern
		i = 1;
		do
		{
			int j = 1;
			do
			{
				System.out.print(i + " ");
				j++;
			} while(j <= 5);
			
			System.out.println();
			i++;
		} while(i <= 5);

		System.out.println("\n-----------------------------");
		System.out.println("Column Number Pattern\n");
		
		// Column Number Pattern
		i = 1;
		do
		{
			int j = 1;
			do
			{
				System.out.print(j + " ");
				j++;
			} while(j <= 5);
			
			System.out.println();
			i++;
		} while(i <= 5);

		System.out.println("\n-----------------------------");
		System.out.println("Reverse Row Number Pattern\n");
		
		// Reverse Row Number Pattern
		i = 5;
		do
		{
			int j = 1;
			do
			{
				System.out.print(i + " ");
				j++;
			} while(j <= 5);
			
			System.out.println();
			i--;
		} while(i >= 1);

		System.out.println("\n-----------------------------");
		System.out.println("Reverse Column Number Pattern\n");
		
		// Reverse Column Number Pattern
		i = 1;
		do
		{
			int j = 5;
			do
			{
				System.out.print(j + " ");
				j--;
			} while(j >= 1);
			
			System.out.println();
			i++;
		} while(i <= 5);

		System.out.println("\n-----------------------------");
		System.out.println("Alphabet Square Pattern\n");
		
		// Alphabet Square Pattern
		i = 1;
		do
		{
			int j = 1;
			do
			{
				System.out.print("A ");
				j++;
			} while(j <= 5);
			
			System.out.println();
			i++;
		} while(i <= 5);

		System.out.println("\n-----------------------------");
		System.out.println("Alphabet Row Pattern\n");
		
		// Alphabet Row Pattern
		char ch = 'A';
		do
		{
			int j = 1;
			do
			{
				System.out.print(ch + " ");
				j++;
			} while(j <= 5);
			
			System.out.println();
			ch++;
		} while(ch <= 'E');

		System.out.println("\n-----------------------------");
		System.out.println("Alphabet Column Pattern\n");
		
		// Alphabet Column Pattern
		i = 1;
		do
		{
			ch = 'A';
			do
			{
				System.out.print(ch + " ");
				ch++;
			} while(ch <= 'E');
			
			System.out.println();
			i++;
		} while(i <= 5);

		System.out.println("\n-----------------------------");
		System.out.println("Reverse Alphabet Row Pattern\n");
		
		// Reverse Alphabet Row Pattern
		ch = 'E';
		do
		{
			int j = 1;
			do
			{
				System.out.print(ch + " ");
				j++;
			} while(j <= 5);
			
			System.out.println();
			ch--;
		} while(ch >= 'A');

		System.out.println("\n-----------------------------");
		System.out.println("Reverse Alphabet Column Pattern\n");
		
		// Reverse Alphabet Column Pattern
		i = 1;
		do
		{
			ch = 'E';
			do
			{
				System.out.print(ch + " ");
				ch--;
			} while(ch >= 'A');
			
			System.out.println();
			i++;
		} while(i <= 5);

		System.out.println("\n-----------------------------");
		System.out.println("Alphabet Column Mix Pattern\n");
		
		// Alphabet Column Mix Pattern
		i = 1;
		do
		{
			ch = 'A';
			do
			{
				if(i == 2)
				{
					System.out.print("* ");
				}
				else if(i == 4)
				{
					System.out.print("$ ");
				}
				else if(ch == 'C')
				{
					System.out.print("% ");
				}
				else
				{
					System.out.print(ch + " ");
				}
				ch++;
			} while(ch <= 'E');
			
			System.out.println();
			i++;
		} while(i <= 5);
	}
}