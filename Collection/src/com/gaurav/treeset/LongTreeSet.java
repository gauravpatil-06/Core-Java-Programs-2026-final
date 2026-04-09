package com.gaurav.treeset;

import java.util.TreeSet;

public class LongTreeSet
{
    public static void main(String[] args)
    {
        TreeSet<Long> ts = new TreeSet<Long>();

        ts.add(1000000000000000L);
        ts.add(2000000000000000L);
        ts.add(3000000000000000L);
        ts.add(4000000000000000L);
        ts.add(5000000000000000L);
        ts.add(6000000000000000L);
        ts.add(7000000000000000L);
        ts.add(8000000000000000L);
        ts.add(9000000000000000L);
        ts.add(10000000000000000L);

        System.out.println(ts);
    }
}