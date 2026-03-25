package com.gaurav.vector;

import java.util.Vector;
import java.util.Iterator;

public class IteratorIteration 
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
		
		Iterator<String> itr = v.iterator();
		
		while (itr.hasNext()) // check next element
		{
			System.out.println(itr.next()); // print element
		}
	}
}
