package com.gaurav.transferorjumpstatement;

import java.util.Scanner;

public class Pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("========= PATTERN MENU =========");
			System.out.println("1. Square Star Pattern");
			System.out.println("2. Row Number Pattern");
			System.out.println("3. Column Number Pattern");
			System.out.println("4. Alphabet Row Pattern");
			System.out.println("5. Mixed Symbol Pattern");
			System.out.println("================================");

			System.out.print("Select Pattern: ");
			int choice = sc.nextInt();

			System.out.print("Enter Rows: ");
			int rows = sc.nextInt();

			System.out.print("Enter Columns: ");
			int cols = sc.nextInt();

			System.out.println();

			switch(choice)
			{
				case 1:
					System.out.println("Square Star Pattern\n");
					for(int i = 1; i <= rows; i++)
					{
						for(int j = 1; j <= cols; j++)
						{
							System.out.print("* ");
						}
						System.out.println();
					}
					break;

				case 2:
					System.out.println("Row Number Pattern\n");
					for(int i = 1; i <= rows; i++)
					{
						for(int j = 1; j <= cols; j++)
						{
							System.out.print(i + " ");
						}
						System.out.println();
					}
					break;

				case 3:
					System.out.println("Column Number Pattern\n");
					for(int i = 1; i <= rows; i++)
					{
						for(int j = 1; j <= cols; j++)
						{
							System.out.print(j + " ");
						}
						System.out.println();
					}
					break;

				case 4:
					System.out.println("Alphabet Row Pattern\n");
					char ch = 'A';
					for(int i = 1; i <= rows; i++)
					{
						for(int j = 1; j <= cols; j++)
						{
							System.out.print(ch + " ");
						}
						ch++;
						System.out.println();
					}
					break;

				case 5:
					System.out.println("Mixed Symbol Pattern\n");
					for(int i = 1; i <= rows; i++)
					{
						for(int j = 1; j <= cols; j++)
						{
							if(i == 2)
							{
								System.out.print("# ");
							}
							else if(j == 3)
							{
								System.out.print("% ");
							}
							else
							{
								System.out.print("* ");
							}
						}
						System.out.println();
					}
					break;

				default:
					System.out.println("Invalid Pattern Selection");
			}
			System.out.println();
			
		}while(true);
	}
}