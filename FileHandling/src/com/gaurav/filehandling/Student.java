package com.gaurav.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Student
{
	int id;
	int rollNo;
	String name;
	static String collegeName = "DYPCOE";

	public static void main(String[] args)
	{
		FileWriter fw = null;

		try
		{
			fw = new FileWriter("D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\Student.txt");

			// Student 1
			Student s1 = new Student();
			s1.id = 101;
			s1.rollNo = 57;
			s1.name = "Gaurav Patil";

			// Student 2
			Student s2 = new Student();
			s2.id = 102;
			s2.rollNo = 58;
			s2.name = "Vinod Mangate";

			// Student 3
			Student s3 = new Student();
			s3.id = 103;
			s3.rollNo = 59;
			s3.name = "Bhagyesh Bhalerao";

			// Student 4
			Student s4 = new Student();
			s4.id = 104;
			s4.rollNo = 60;
			s4.name = "Vikas Dhobi";

			// Student 5
			Student s5 = new Student();
			s5.id = 105;
			s5.rollNo = 61;
			s5.name = "Suraj Desale";

			// Writing data to file
			writeStudent(fw, s1);
			writeStudent(fw, s2);
			writeStudent(fw, s3);
			writeStudent(fw, s4);
			writeStudent(fw, s5);

			fw.flush();
			System.out.println("File written successfully");
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

	static void writeStudent(FileWriter fw, Student s) throws IOException
	{
		fw.write("\n-------------------------");
		fw.write("\nStudent ID           : " + s.id);
		fw.write("\nStudent Roll No      : " + s.rollNo);
		fw.write("\nStudent Name         : " + s.name);
		fw.write("\nStudent College Name : " + collegeName);
		fw.write("\n-------------------------");
	}
}