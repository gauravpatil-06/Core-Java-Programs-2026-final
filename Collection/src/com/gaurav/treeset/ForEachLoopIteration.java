package com.gaurav.treeset;

import java.util.TreeSet;

public class ForEachLoopIteration
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

        // for-each loop (sorted order)
        for (String s : ts)
        {
            System.out.println(s);
        }
    }
}