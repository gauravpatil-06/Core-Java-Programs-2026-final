package com.gaurav.inheritance;

class Author
{
	Author()
	{
		System.out.println("Student Construcotor called");
	}
}

public class Book extends Author
{
	Book()
	{
		System.out.println("Book Construcotor called");
	}
	
	public static void main(String[] args) 
	{
		Book b1 = new Book();
	}
}
