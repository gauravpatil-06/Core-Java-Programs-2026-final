package com.gaurav.conditionalstatement.ifstatement;

import java.util.Scanner;

public class UserValidation 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Username: ");
		String username = sc.nextLine();
		
		if(username.length() < 8)
		{
			System.err.println("Username must be at least 8 characters long");
			return;
		}
		
		System.out.print("Enter Password: ");
		String password = sc.nextLine();
		
		if(password.length() < 8)
		{
			System.err.println("Password must be at least 8 characters long");
			return;
		}
		
		if(username.equals("gauravpatil") && password.equals("GauravPatil"))
		{
			System.out.println("Login Successful");
		}
		
		if(!(username.equals("gauravpatil") && password.equals("GauravPatil")))
		{
			System.err.println("Login Failed");
		}
	}
}