package com.gaurav.abstraction;

// Child class - UPI
class UPI extends Payment
{
	void pay()
	{
		System.out.println("UPI Payment Successfully Done");
	}
}

// Child class - Debit Card
class Debit extends Payment
{
	void pay()
	{
		System.out.println("Debit Card Payment Successfully Done");
	}
}

// Child class - Credit Card
class Credit extends Payment
{
	void pay()
	{
		System.out.println("Credit Card Payment Successfully Done");
	}
}

// Child class - Cash
class Cash extends Payment
{
	void pay()
	{
		System.out.println("Cash Payment Successfully Done");
	}
}

public class PaymentAbstraction
{
	public static void main(String[] args) 
	{
		Payment p;

		p = new UPI();
		p.pay();
		System.out.println("-------------------------------------");
		
		p = new Debit();
		p.pay();
		System.out.println("-------------------------------------");
		
		p = new Credit();
		p.pay();
		System.out.println("-------------------------------------");
		
		p = new Cash();
		p.pay();
		System.out.println("-------------------------------------");
	}
}