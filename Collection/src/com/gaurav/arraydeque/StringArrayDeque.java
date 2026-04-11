package com.gaurav.arraydeque;

import java.util.ArrayDeque;

public class StringArrayDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<String> dq = new ArrayDeque<String>();

        dq.add("Gaurav");
        dq.add("Vinod");
        dq.add("Bhagyesh");
        dq.add("Suraj");
        dq.add("Vikas");
        dq.add("Abhishek");
        dq.add("Vitthal");
        dq.add("Akash");
        dq.add("Praful");
        dq.add("Pavan");

        System.out.println(dq);
    }
}