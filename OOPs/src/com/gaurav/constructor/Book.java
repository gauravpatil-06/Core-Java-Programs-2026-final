package com.gaurav.constructor;

public class Book 
{
	int id;
	String bookName;
	String authorName;
	double bookPrice;
	
	// Parameterized Constructor
	Book(int id, String bookName, String authorName, double bookPrice)
	{
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
	}
	
	void display()
	{
		System.out.println("Book ID     : " + id);
		System.out.println("Book Name   : " + bookName);
		System.out.println("Author Name : " + authorName);
		System.out.println("Book Price  : ₹" + bookPrice);
		System.out.println("--------------------------------");
	}

	public static void main(String[] args) 
	{
		Book b1 = new Book(101, "Java Programming", "James Gosling", 499.00);
		Book b2 = new Book(102, "Python Basics", "Guido van Rossum", 399.00);
		Book b3 = new Book(103, "C Programming", "Dennis Ritchie", 299.00);
		Book b4 = new Book(104, "Data Structures", "Mark Allen Weiss", 599.00);
		Book b5 = new Book(105, "Operating System", "Abraham Silberschatz", 699.00);
		
		b1.display();
		b2.display();
		b3.display();
		b4.display();
		b5.display();
	}
}