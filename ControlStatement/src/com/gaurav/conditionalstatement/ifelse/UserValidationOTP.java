package com.gaurav.conditionalstatement.ifelse;

import java.util.Scanner;

public class UserValidationOTP
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
			int otp = (int)(Math.random() * 1000000);
			System.out.println("Your OTP is: " + otp);

			System.out.print("Enter OTP: ");
			int userOtp = sc.nextInt();

			if(userOtp == otp)
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.err.println("Login Failed : Invalid OTP");
			}
		}
		else
		{
			System.err.println("Login Failed : Invalid Username or Password");
		}

		sc.close();
	}
}