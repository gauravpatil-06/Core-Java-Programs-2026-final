package com.gaurav.conditionalstatement.ifelse;

import java.util.Scanner;

public class ProductDiscount 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Product Price: ");
		double product_price = sc.nextDouble();
		
		if(product_price > 5000)
		{
			System.out.println("Discount Applied: 5%");
		}
		else
		{
			System.out.println("No Discount Available");
		}
	}
}
