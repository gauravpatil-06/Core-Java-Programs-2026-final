package com.gaurav.stack;

public class Product
{
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private String category;

	public Product(int productId, String productName, double price, int quantity, String category)
	{
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public void display()
	{
		System.out.println("Product Id      : " + productId);
		System.out.println("Product Name    : " + productName);
		System.out.println("Product Price   : " + price);
		System.out.println("Product Quantity: " + quantity);
		System.out.println("Product Category: " + category);
		System.out.println("--------------------------------");
	}

	public int getProductId()
	{
		return productId;
	}

	public String getProductName()
	{
		return productName;
	}

	public double getPrice()
	{
		return price;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public String getCategory()
	{
		return category;
	}
}
