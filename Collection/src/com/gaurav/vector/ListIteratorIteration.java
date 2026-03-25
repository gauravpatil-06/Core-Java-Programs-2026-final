package com.gaurav.vector;

import java.util.Vector;
import java.util.ListIterator;

public class ListIteratorIteration 
{
	public static void main(String[] args) 
	{
		Vector<String> v = new Vector<String>();
		
		v.add("Gaurav");
		v.add("Vinod");
		v.add("Bhagyesh");
		v.add("Suraj");
		v.add("Vikas");
		v.add("Abhishek");
		v.add("Vitthal");
		v.add("Akash");
		v.add("Praful");
		v.add("Pavan");
		
		ListIterator<String> ltr = v.listIterator();
		
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