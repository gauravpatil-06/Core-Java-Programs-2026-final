package com.gaurav.exceptionhandling;

public class UserNotFoundException extends RuntimeException
{
	public UserNotFoundException(String msg)
	{
		super(msg);
	}
}