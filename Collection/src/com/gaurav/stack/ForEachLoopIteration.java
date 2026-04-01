package com.gaurav.stack;

import java.util.Stack;

public class ForEachLoopIteration 
{
	public static void main(String[] args) 
	{
		Stack<String> s = new Stack<String>();
		
		s.add("Gaurav");
		s.add("Vinod");
		s.add("Bhagyesh");
		s.add("Suraj");
		s.add("Vikas");
		s.add("Abhishek");
		s.add("Vitthal");
		s.add("Akash");
		s.add("Praful");
		s.add("Pavan");
		
		for (String i : s) 
		{
			System.out.println(i);
		}
	}
}
