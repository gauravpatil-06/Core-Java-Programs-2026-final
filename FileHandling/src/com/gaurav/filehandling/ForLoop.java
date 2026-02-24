package com.gaurav.filehandling;

import java.io.*;

public class ForLoop 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter fw = new FileWriter("D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\ForLoop.txt");
			
			for(int i=0; i<10; i++)
			{
				fw.write("\nGaurav Patil");
			}
			
			fw.flush();
			
			System.out.println("File Written Successfully");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
