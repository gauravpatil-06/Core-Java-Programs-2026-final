package com.gaurav.treeset;

import java.util.TreeSet;
import java.util.Iterator;

public class IteratorIteration
{
    public static void main(String[] args)
    {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Gaurav");
        ts.add("Vinod");
        ts.add("Bhagyesh");
        ts.add("Suraj");
        ts.add("Vikas");
        ts.add("Abhishek");
        ts.add("Vitthal");
        ts.add("Akash");
        ts.add("Praful");
        ts.add("Pavan");

        Iterator<String> itr = ts.iterator();

        while (itr.hasNext())   // check next element
        {
            System.out.println(itr.next()); // print element
        }
    }
}