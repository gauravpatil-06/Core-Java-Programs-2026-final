package com.gaurav.transferorjumpstatement;

import java.util.Scanner;

public class Switch
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- Day of the Week -----");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		
		System.out.print("Enter your choice (1-7): ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("You selected Monday");
				break;
				
			case 2:
				System.out.println("You selected Tuesday");
				break;
				
			case 3:
				System.out.println("You selected Wednesday");
				break;
				
			case 4:
				System.out.println("You selected Thursday");
				break;
				
			case 5:
				System.out.println("You selected Friday");
				break;
				
			case 6:
				System.out.println("You selected Saturday");
				break;
				
			case 7:
				System.out.println("You selected Sunday");
				break;
				
			default:
				System.err.println("Invalid choice. Please enter between 1 and 7.");
		}
	}
}