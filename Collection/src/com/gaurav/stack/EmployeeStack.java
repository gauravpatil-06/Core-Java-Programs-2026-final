package com.gaurav.stack;

import java.util.Stack;

public class EmployeeStack 
{
	public static void main(String[] args) 
	{
		Stack <Employee> emp = new Stack <Employee>();
		
		emp.add(new Employee(101, "Gaurav", 100000.50, "IT", "Pune"));
		emp.add(new Employee(102, "Vinod", 88000.00, "IT", "Mumbai"));
		emp.add(new Employee(103, "Suraj", 60000.00, "Developer", "Nashik"));
		emp.add(new Employee(104, "Akash", 59000.00, "Testing", "Nagpur"));
		emp.add(new Employee(105, "Abhishek", 48000.25, "Support", "Kolhapur"));
		
		for (Employee e : emp) 
		{
			if (e.getSalary() > 60000.00  && e.getDepartment().equals("IT"))
			{
				e.display();
			}
		}
	}
}