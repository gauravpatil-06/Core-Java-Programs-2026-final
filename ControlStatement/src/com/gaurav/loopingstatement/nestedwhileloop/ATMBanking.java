package com.gaurav.loopingstatement.nestedwhileloop;

import java.util.Scanner;

public class ATMBanking 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int attempts = 0;
		int pin = 992346;
		double balance = 1000;
		
		while(attempts < 3)
		{
			System.out.print("Enter Your Pin: ");
			int userPin = sc.nextInt();
			
			if(userPin == pin)
			{
				System.out.println("Pin verified... ✅");
				
				int choice;
				while(true)
				{
					System.out.println("\n----------- BANK MENU -----------");
					System.out.println("1. Check Balance");
					System.out.println("2. Deposit Amount");
					System.out.println("3. Withdraw Amount");
					System.out.println("4. Exit");
					System.out.println("--------------------------------");
					
					System.out.print("Enter your choice (1-4): ");
					choice = sc.nextInt();
					System.out.println("--------------------------------");
					
					if(choice == 1)
					{
						System.out.println("Available Balance: ₹" + balance);
					}
					else if(choice == 2)
					{
						System.out.print("Enter deposit amount: ₹");
						double deposit = sc.nextDouble();
						
						if(deposit > 0)
						{
							balance += deposit;
							System.out.println("Deposit Successful");
							System.out.println("Updated Balance: ₹" + balance);
						}
						else
						{
							System.out.println("Invalid amount. Please enter a positive value.");
						}
					}
					else if(choice == 3)
					{
						System.out.print("Enter withdrawal amount: ₹");
						double withdraw = sc.nextDouble();
						
						if(withdraw > 0)
						{
							if(withdraw <= balance)
							{
								balance -= withdraw;
								System.out.println("Withdrawal Successful");
								System.out.println("Updated Balance: ₹" + balance);
							}
							else
							{
								System.out.println("Transaction Failed: Insufficient Balance");
							}
						}
						else
						{
							System.out.println("Invalid amount. Please enter a positive value.");
						}
					}
					else if(choice == 4)
					{
						System.out.println("Thank you for using our Banking Service");
						System.out.println("Have a great day!");
						break; // exit menu
					}
					else
					{
						System.out.println("Invalid choice. Please select between 1 and 4 only.");
					}
				}
				break; // exit after successful login
			}
			else
			{
				attempts++;
				System.err.println("Incorrect Pin");
				System.out.println("Attempts Left: " + (3 - attempts));
				
				if(attempts == 3)
				{
					System.err.println("Your account has been locked");
				}
			}
		}
		
		sc.close();
	}
}