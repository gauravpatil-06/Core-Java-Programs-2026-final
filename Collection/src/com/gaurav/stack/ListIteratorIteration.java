package com.gaurav.stack;

import java.util.Stack;
import java.util.ListIterator;

public class ListIteratorIteration 
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
		
		ListIterator<String> ltr = s.listIterator();
		
		System.out.println("Forward Direction\n");
		
		while (ltr.hasNext())   // check next element
		{
			System.out.println(ltr.next()); // print element
		}
		
		System.out.println("\nBackward Direction\n");
		
		while (ltr.hasPrevious()) // check previous element
		{
			System.out.println(ltr.previous()); // print element
		}
	}
}