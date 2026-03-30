package com.gaurav.stack;

public class Book 
{
	private int bookId;
	private String title;
	private String author;
	private double price;
	private int pages;

	public Book(int bookId, String title, String author, double price, int pages) 
	{
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}

	public void display()
	{
		System.out.println("Book Id     : " + bookId);
		System.out.println("Book Title  : " + title);
		System.out.println("Book Author : " + author);
		System.out.println("Book Price  : " + price);
		System.out.println("Book Pages  : " + pages);
		System.out.println("--------------------------------");
	}

	public int getBookId() 
	{
		return bookId;
	}

	public void setBookId(int bookId) 
	{
		this.bookId = bookId;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getAuthor() 
	{
		return author;
	}

	public void setAuthor(String author) 
	{
		this.author = author;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public int getPages() 
	{
		return pages;
	}

	public void setPages(int pages) 
	{
		this.pages = pages;
	}
}