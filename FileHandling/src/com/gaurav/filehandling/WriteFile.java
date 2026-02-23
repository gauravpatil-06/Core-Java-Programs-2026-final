package com.gaurav.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{

	public static void main(String[] args)
	{
		
		try
		{
			FileWriter fw = new FileWriter("D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\MyData.txt", true);

			fw.write("\nHi, I am Gaurav Patil");
			fw.write("\nLearning Core Java File Handling");
			fw.write("\nThis is append mode example");

			fw.flush();
			fw.close();

			System.out.println("File written successfully");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}