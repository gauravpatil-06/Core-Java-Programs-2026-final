package com.gaurav.loopingstatement.dowhileloop;

import java.util.Scanner;

public class MovieTicketBooking 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int choice;
		String movie = "";
		int qty = 0;
		int total = 0;
		double discount = 0.0;
		double finaltotal = 0.0;
		
		do
		{
			System.out.println("\n----- Movie Ticket Booking -----");
			System.out.println("1. Dhurandhar - ₹350");
			System.out.println("2. Saiyara    - ₹250");
			System.out.println("3. DashAvatar - ₹499");
			System.out.println("4. Kantara    - ₹550");
			System.out.println("5. Jawan      - ₹450");
			System.out.println("0. Exit");
			
			System.out.print("\nEnter your Choice: ");
			choice = sc.nextInt();
			
			if(choice == 1)
			{
				movie = "Dhurandhar";
				System.out.print("Enter Quantity: ");
				qty = sc.nextInt();
				
				total = qty * 350;
			}
			else if(choice == 2)
			{
				movie = "Saiyara";
				System.out.print("Enter Quantity: ");
				qty = sc.nextInt();
				
				total = qty * 250;
			}
			else if(choice == 3)
			{
				movie = "DashAvatar";
				System.out.print("Enter Quantity: ");
				qty = sc.nextInt();
				
				total = qty * 499;
			}
			else if(choice == 4)
			{
				movie = "Kantara";
				System.out.print("Enter Quantity: ");
				qty = sc.nextInt();
				
				total = qty * 550;
			}
			else if(choice == 5)
			{
				movie = "Jawan";
				System.out.print("Enter Quantity: ");
				qty = sc.nextInt();
				
				total = qty * 450;
			}
			else if(choice == 0)
			{
				System.out.println("Thank you! Visit again 🎬");
				break;
			}
			else
			{
				System.out.println("Invalid Choice! Please select 1 to 5.");
				break;
			}
			
			if(total >= 2000)
			{
				discount = total * 0.10;
			}
			else
			{
				discount = 0;
			}
			
			finaltotal = total - discount;
			
			System.out.println("\n--- Ticket Booked Successfully ---");
			System.out.println("Movie Name   : " + movie);
			System.out.println("Quantity     : " + qty);
			System.out.println("Total Amount : ₹" + total);
			System.out.println("Discount     : ₹" + discount);
			System.out.println("Final Amount : ₹" + finaltotal);
			
		} while(true);
	}
}