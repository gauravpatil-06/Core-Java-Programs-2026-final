package com.gaurav.conditionalstatement.nestedif;

import java.util.Scanner;

public class BankingApp 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double balance = 1000;
		int pin = 992346;

		System.out.print("Enter your PIN: ");
		int userPin = sc.nextInt();
		
		if(userPin == pin)
		{
			int choice;
			
			do
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
				}
				else
				{
					System.out.println("Invalid choice. Please select between 1 and 4 only.");
				}
				
			} while(choice != 4);
		}
		else
		{
			System.out.println("Incorrect PIN. Access Denied.");
		}
	}
}