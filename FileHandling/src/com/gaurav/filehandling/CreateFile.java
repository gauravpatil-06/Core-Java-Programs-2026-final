package com.gaurav.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile
{
	public static void main(String[] args)
	{
		// Creating File object with file path
		File file = new File("D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\Demo.txt");

		try
		{
			// createNewFile() returns true if file is created
			if(file.createNewFile())
			{
				System.out.println("File created successfully");
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("Error while creating file: " + e.getMessage());
		}
	}
}