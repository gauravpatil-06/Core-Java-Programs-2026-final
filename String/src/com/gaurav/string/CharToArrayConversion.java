package com.gaurav.string;

public class CharToArrayConversion 
{
	public static void main(String[] args) 
	{
		// Char Array to display
		char arr[] = {'G','A','U','R','A','V'};

		System.out.println("Char Array Elements:");
		for(char ch : arr)
		{
			System.out.print(ch + " ");
		}

		System.out.println("\n\nString to Char Array Conversion:");

		// String to Char Array
		String str = "Gaurav Patil";
		char c[] = str.toCharArray();

		for(char d : c) 
		{
			System.out.println(d);
		}
	}
}