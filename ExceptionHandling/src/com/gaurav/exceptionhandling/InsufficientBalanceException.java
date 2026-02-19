package com.gaurav.exceptionhandling;

public class InsufficientBalanceException extends RuntimeException 
{
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
