package com.gaurav.polymorphism;

class Bank
{
	double intrest;
	
	void calcIntrest(int amount)
	{
		intrest = 4.5;
		int totalIntrest = (int) (amount * intrest)/100;
		System.out.println("Intrest: "+totalIntrest);
	}
}

class SBI extends Bank
{
	void calcIntrest(int amount)
	{
		intrest = 9.5;
		int totalintrest = (int) (amount * intrest)/100;
		System.out.println("Intrest: "+totalintrest);
	}
}

class Axis extends Bank
{
	void calcIntrest(int amount)
	{
		intrest = 7.5;
		int totalintrest = (int) (amount * intrest)/100;
		System.out.println("Intrest: "+totalintrest);
	}
}

public class BankOverriding
{
	public static void main(String[] args) 
	{
		Bank b1;
		
		b1  = new Bank();
		b1.calcIntrest(100000);
		
		b1  = new SBI();
		b1.calcIntrest(100000);
		
		b1  = new Axis();
		b1.calcIntrest(100000);
	}
}


