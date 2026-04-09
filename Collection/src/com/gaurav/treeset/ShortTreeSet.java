package com.gaurav.treeset;

import java.util.TreeSet;

public class ShortTreeSet
{
    public static void main(String[] args)
    {
        TreeSet<Short> ts = new TreeSet<Short>();

        ts.add((short)1);
        ts.add((short)2);
        ts.add((short)3);
        ts.add((short)4);
        ts.add((short)5);
        ts.add((short)6);
        ts.add((short)7);
        ts.add((short)8);
        ts.add((short)9);
        ts.add((short)10);

        System.out.println(ts);
    }
}