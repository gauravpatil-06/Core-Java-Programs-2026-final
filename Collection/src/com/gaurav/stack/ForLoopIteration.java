package com.gaurav.stack;

import java.util.Stack;

public class ForLoopIteration 
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
		
		for(int i=0; i<s.size(); i++)
		{
			System.out.println(s.get(i));
		}
	}
}
