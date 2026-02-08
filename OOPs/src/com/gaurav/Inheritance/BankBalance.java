package com.gaurav.inheritance;

class Balance
{
	void bankBalance()
	{
		System.out.println("Parent bank balance: 10 Cr");
	}
}

public class BankBalance extends Balance
{
	void bankBalance()
	{
		System.out.println("Child bank balance: 1 Cr");
	}
	
	void display()
	{
		bankBalance();          // Child class method
		super.bankBalance();    // Parent class method
	}
	
	public static void main(String[] args) 
	{
		BankBalance b1 = new BankBalance();
		b1.display();
	}
}