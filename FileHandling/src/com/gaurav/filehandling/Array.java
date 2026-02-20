package com.gaurav.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Array
{
	public static void main(String[] args)
	{
		int arr[] = {10, 20, 30, 40, 50};
		
		FileWriter fw = null;

		try
		{
			fw = new FileWriter("D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\Array.txt");

			for(int i = 0; i < arr.length; i++)
			{
				fw.write("Index " + i + " : " + arr[i] + "\n");
			}

			fw.flush();
			
			System.out.println("Array data written successfully");
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
}