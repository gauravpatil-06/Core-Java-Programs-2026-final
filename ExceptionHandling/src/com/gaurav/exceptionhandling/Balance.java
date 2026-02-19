package com.gaurav.exceptionhandling;

public class Balance
{
	int balance = 1000;

	void deposit(int amount)
	{
		if(amount > 0)
		{
			balance += amount;
			System.out.println("Amount deposited successfully");
			System.out.println("Current Balance: " + balance);
		}
		else
		{
			throw new InsufficientBalanceException("Invalid deposit amount");
		}
	}

	void withdraw(int amount)
	{
		if(amount > 0)
		{
			if(amount <= balance)
			{
				balance -= amount;
				System.out.println("Amount withdrawn successfully");
				System.out.println("Current Balance: " + balance);
			}
			else
			{
				throw new InsufficientBalanceException("Insufficient balance");
			}
		}
		else
		{
			throw new InsufficientBalanceException("Invalid withdrawal amount");
		}
	}

	public static void main(String[] args)
	{
		Balance b1 = new Balance();

		try
		{
			b1.deposit(500);
			b1.withdraw(1000);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}
}