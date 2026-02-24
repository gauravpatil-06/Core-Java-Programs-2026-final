package com.gaurav.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Employee
{
	int id;
	int empNo;
	String name;
	static String companyName = "DYPCOE";

	public static void main(String[] args)
	{
		FileWriter fw = null;

		try
		{
			fw = new FileWriter(
				"D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\Employee.txt"
			);

			// Employee 1
			Employee e1 = new Employee();
			e1.id = 101;
			e1.empNo = 501;
			e1.name = "Gaurav Patil";

			// Employee 2
			Employee e2 = new Employee();
			e2.id = 102;
			e2.empNo = 502;
			e2.name = "Vinod Mangate";

			// Employee 3
			Employee e3 = new Employee();
			e3.id = 103;
			e3.empNo = 503;
			e3.name = "Bhagyesh Bhalerao";

			// Employee 4
			Employee e4 = new Employee();
			e4.id = 104;
			e4.empNo = 504;
			e4.name = "Vikas Dhobi";

			// Employee 5
			Employee e5 = new Employee();
			e5.id = 105;
			e5.empNo = 505;
			e5.name = "Suraj Desale";

			// Writing data to file
			writeEmployee(fw, e1);
			writeEmployee(fw, e2);
			writeEmployee(fw, e3);
			writeEmployee(fw, e4);
			writeEmployee(fw, e5);

			fw.flush();
			System.out.println("Employee data written successfully");
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

	static void writeEmployee(FileWriter fw, Employee e) throws IOException
	{
		fw.write("\n-------------------------");
		fw.write("\nEmployee ID        : " + e.id);
		fw.write("\nEmployee Number    : " + e.empNo);
		fw.write("\nEmployee Name      : " + e.name);
		fw.write("\nCompany Name       : " + companyName);
		fw.write("\n-------------------------\n");
	}
}