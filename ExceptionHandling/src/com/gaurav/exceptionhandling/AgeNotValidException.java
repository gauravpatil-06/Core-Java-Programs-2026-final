package com.gaurav.exceptionhandling;

public class AgeNotValidException extends RuntimeException
{
	public AgeNotValidException(String msg)
	{
		super(msg);
	}
}