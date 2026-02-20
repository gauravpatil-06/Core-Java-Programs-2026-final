package com.gaurav.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Book
{
	int id;
	String bookName;
	String authorName;
	double price;
	static String publisher = "Technical Publications";

	public static void main(String[] args)
	{
		FileWriter fw = null;

		try
		{
			fw = new FileWriter(
				"D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\Book.txt"
			);

			// Book 1
			Book b1 = new Book();
			b1.id = 101;
			b1.bookName = "Core Java";
			b1.authorName = "James Gosling";
			b1.price = 499;

			// Book 2
			Book b2 = new Book();
			b2.id = 102;
			b2.bookName = "Advanced Java";
			b2.authorName = "Herbert Schildt";
			b2.price = 599;

			// Book 3
			Book b3 = new Book();
			b3.id = 103;
			b3.bookName = "Spring Boot";
			b3.authorName = "Craig Walls";
			b3.price = 699;

			// Book 4
			Book b4 = new Book();
			b4.id = 104;
			b4.bookName = "Hibernate";
			b4.authorName = "Gavin King";
			b4.price = 549;

			// Book 5
			Book b5 = new Book();
			b5.id = 105;
			b5.bookName = "DSA in Java";
			b5.authorName = "Narasimha Karumanchi";
			b5.price = 799;

			// Writing data to file
			writeBook(fw, b1);
			writeBook(fw, b2);
			writeBook(fw, b3);
			writeBook(fw, b4);
			writeBook(fw, b5);

			fw.flush();
			System.out.println("Book data written successfully");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				fw.close();
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	static void writeBook(FileWriter fw, Book b) throws IOException
	{
		fw.write("\n-------------------------");
		fw.write("\nBook ID        : " + b.id);
		fw.write("\nBook Name      : " + b.bookName);
		fw.write("\nAuthor Name    : " + b.authorName);
		fw.write("\nBook Price     : ₹" + b.price);
		fw.write("\nPublisher      : " + publisher);
		fw.write("\n-------------------------\n");
	}
}