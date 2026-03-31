package com.gaurav.stack;

import java.util.Stack;

public class StudentStack 
{
	public static void main(String[] args) 
	{
		Stack<Student> stud = new Stack<Student>();
		
		stud.add(new Student(101, "Gaurav", 93.81, 19, "Pune"));
		stud.add(new Student(102, "Vinod", 88.45, 20, "Sambhaji Nagar"));
		stud.add(new Student(103, "Bhagyesh", 91.20, 19, "jalgaon"));
		stud.add(new Student(104, "Suraj", 85.60, 21, "Mumbai"));
		stud.add(new Student(105, "Akash", 89.75, 20, "Akola"));
	
		for (Student s : stud) 
		{
			s.display();
		}
		
	}
}