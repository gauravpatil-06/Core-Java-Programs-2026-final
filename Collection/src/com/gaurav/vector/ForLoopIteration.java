package com.gaurav.vector;

import java.util.Vector;

public class ForLoopIteration 
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
		
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.get(i));
		}
	}
}
