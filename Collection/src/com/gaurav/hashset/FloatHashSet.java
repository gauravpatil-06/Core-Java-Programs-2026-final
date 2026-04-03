package com.gaurav.hashset;

import java.util.HashSet;

public class FloatHashSet
{
    public static void main(String[] args)
    {
        HashSet<Float> hs = new HashSet<>();

        hs.add(10.5f);
        hs.add(20.5f);
        hs.add(30.5f);
        hs.add(40.5f);
        hs.add(50.5f);

        System.out.println(hs);
    }
}