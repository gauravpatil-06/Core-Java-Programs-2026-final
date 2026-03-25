package com.gaurav.vector;

import java.util.Vector;

public class ForEachLoopIteration 
{
	public static void main(String[] args) 
	{
		Vector<String> ll = new Vector<String>();
		
		ll.add("Gaurav");
		ll.add("Vinod");
		ll.add("Bhagyesh");
		ll.add("Suraj");
		ll.add("Vikas");
		ll.add("Abhishek");
		ll.add("Vitthal");
		ll.add("Akash");
		ll.add("Praful");
		ll.add("Pavan");
		
		for (String s : ll) 
		{
			System.out.println(s);
		}
	}
}
