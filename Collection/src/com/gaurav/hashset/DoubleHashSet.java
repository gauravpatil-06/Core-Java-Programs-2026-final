package com.gaurav.hashset;

import java.util.HashSet;

public class DoubleHashSet
{
    public static void main(String[] args)
    {
        HashSet<Double> hs = new HashSet<>();

        hs.add(100.50);
        hs.add(200.50);
        hs.add(300.50);
        hs.add(400.50);
        hs.add(500.50);

        System.out.println(hs);
    }
}