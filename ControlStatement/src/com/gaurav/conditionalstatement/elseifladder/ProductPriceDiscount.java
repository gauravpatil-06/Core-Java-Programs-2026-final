package com.gaurav.conditionalstatement.elseifladder;

import java.util.Scanner;

public class ProductPriceDiscount 
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Product Price: ");
		double product_price = sc.nextDouble();
		
		if(product_price >= 50000)
		{
			double discount = product_price * 0.50;
			double final_price = product_price - discount;
			
			System.out.println("Discount Applied: 50%");
			System.out.println("Discount Amount: " + discount);
			System.out.println("Final Price: " + product_price + " - " + discount + " = " + final_price);
		}
		else if(product_price >= 40000)
		{
			double discount = product_price * 0.40;
			double final_price = product_price - discount;
			
			System.out.println("Discount Applied: 40%");
			System.out.println("Discount Amount: " + discount);
			System.out.println("Final Price: " + product_price + " - " + discount + " = " + final_price);
		}
		else if(product_price >= 30000)
		{
			double discount = product_price * 0.30;
			double final_price = product_price - discount;
			
			System.out.println("Discount Applied: 30%");
			System.out.println("Discount Amount: " + discount);
			System.out.println("Final Price: " + product_price + " - " + discount + " = " + final_price);
		}
		else if(product_price >= 20000)
		{
			double discount = product_price * 0.20;
			double final_price = product_price - discount;
			
			System.out.println("Discount Applied: 20%");
			System.out.println("Discount Amount: " + discount);
			System.out.println("Final Price: " + product_price + " - " + discount + " = " + final_price);
		}
		else if(product_price >= 10000)
		{
			double discount = product_price * 0.10;
			double final_price = product_price - discount;
			
			System.out.println("Discount Applied: 10%");
			System.out.println("Discount Amount: " + discount);
			System.out.println("Final Price: " + product_price + " - " + discount + " = " + final_price);
		}
		else if(product_price >= 5000)
		{
			double discount = product_price * 0.05;
			double final_price = product_price - discount;
			
			System.out.println("Discount Applied: 5%");
			System.out.println("Discount Amount: " + discount);
			System.out.println("Final Price: " + product_price + " - " + discount + " = " + final_price);
		}
		else if(product_price >= 2000)
		{
			double discount = product_price * 0.02;
			double final_price = product_price - discount;
			
			System.out.println("Discount Applied: 2%");
			System.out.println("Discount Amount: " + discount);
			System.out.println("Final Price: " + product_price + " - " + discount + " = " + final_price);
		}
		else
		{
			System.out.println("No Discount Available");
			System.out.println("Discount Amount: 0");
			System.out.println("Final Price: " + product_price);
		}

		sc.close();
	}
}