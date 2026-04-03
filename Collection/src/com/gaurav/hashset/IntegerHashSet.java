package com.gaurav.hashset;

import java.util.HashSet;

public class IntegerHashSet
{
    public static void main(String[] args)
    {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);
        hs.add(70);
        hs.add(80);
        hs.add(90);
        hs.add(100);

        System.out.println(hs);
    }
}