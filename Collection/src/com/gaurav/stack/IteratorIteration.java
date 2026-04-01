package com.gaurav.stack;

import java.util.Stack;
import java.util.Iterator;

public class IteratorIteration 
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
		
		Iterator<String> itr = s.iterator();
		
		while (itr.hasNext()) // check next element
		{
			System.out.println(itr.next()); // print element
		}
	}
}
