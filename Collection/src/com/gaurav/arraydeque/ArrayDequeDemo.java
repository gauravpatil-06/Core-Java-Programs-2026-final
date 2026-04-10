package com.gaurav.arraydeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo
{
    public static void main(String[] args)
    {
        // ArrayDeque using Object type (heterogeneous data)
        ArrayDeque<Object> dq = new ArrayDeque<Object>();

        dq.add(10);                 // Integer
        dq.add(true);               // Boolean
        dq.add(10.10f);             // Float
        dq.add(100);                // Integer
        dq.add(10000000000000000L); // Long
        dq.add(100.000);            // Double
        dq.add("Gaurav");           // String
        dq.add(false);              // Boolean
        dq.add('A');                // Character

        // Display elements
        System.out.println(dq);
    }
}