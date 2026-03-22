package com.gaurav.vector;

import java.util.Vector;

public class BookVector 
{
	public static void main(String[] args) 
	{
		Vector<Book> book = new Vector<Book>();
		
		book.add(new Book(101, "Java Programming", "James Gosling", 550.50, 650));
		book.add(new Book(102, "Python Basics", "Guido van Rossum", 450.00, 520));
		book.add(new Book(103, "C++ Complete Guide", "Bjarne Stroustrup", 600.75, 700));
		book.add(new Book(104, "Data Structures", "Mark Allen Weiss", 720.00, 800));
		book.add(new Book(105, "Web Development", "Jon Duckett", 499.99, 480));
		
		for (Book b : book) 
		{
			if (b.getPrice() > 500)
			{
				b.display();
			}
		}
	}
}