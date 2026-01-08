package com.gaurav.conditionalstatement.ifelse;

public class OTPGenerate 
{
	public static void main(String[] args)
	{
		int otp;

		// Generates a 6-digit random OTP
		otp = (int) (Math.random() * 1000000);

		System.out.println("Your OTP is: " + otp);
	}
}