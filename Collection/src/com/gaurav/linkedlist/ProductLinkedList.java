package com.gaurav.linkedlist;

import java.util.LinkedList;

public class ProductLinkedList
{
	public static void main(String[] args)
	{
		LinkedList<Product> product = new LinkedList<Product>();

		product.add(new Product(101, "Laptop", 75000.00, 2, "Electronics"));
		product.add(new Product(102, "Mobile", 55000.00, 5, "Electronics"));
		product.add(new Product(103, "TV", 48000.00, 1, "Electronics"));
		product.add(new Product(104, "Refrigerator", 62000.00, 1, "Electronics"));
		product.add(new Product(105, "Chair", 3000.00, 10, "Furniture"));

		for (Product p : product)
		{
			if (p.getCategory().equals("Electronics") && p.getPrice() > 50000)
			{
				p.display();
			}
		}
	}
}