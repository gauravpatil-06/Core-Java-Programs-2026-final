package com.gaurav.constructor;

public class ConstructorOverloading 
{
	ConstructorOverloading()
	{
		this(10);
		System.out.println("Default Constructor Called");
	}
	
	ConstructorOverloading(int a)
	{
		this(10, 20);
		System.out.println("One Parameter Constructor Called");
	}
	
	ConstructorOverloading(int a, int b)
	{
		System.out.println("Two Parameter Constructor Called");
	}
	
	public static void main(String[] args) 
	{
		ConstructorOverloading obj = new ConstructorOverloading();
	}
}