package com.gaurav.arraylist;

import java.util.ArrayList;

public class LongArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<Long> al = new ArrayList<Long>();

        al.add(1000000000000000L);
        al.add(2000000000000000L);
        al.add(3000000000000000L);
        al.add(4000000000000000L);
        al.add(5000000000000000L);
        al.add(6000000000000000L);
        al.add(7000000000000000L);
        al.add(8000000000000000L);
        al.add(9000000000000000L);
        al.add(10000000000000000L);

        System.out.println(al);
    }
}