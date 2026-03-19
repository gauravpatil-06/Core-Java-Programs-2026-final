package com.gaurav.vector;

import java.util.Vector;

public class BooleanVector
{
    public static void main(String[] args)
    {
        Vector<Boolean> v = new Vector<Boolean>();

        v.add(true);
        v.add(false);
        v.add(true);
        v.add(false);
        v.add(true);
        v.add(false);
        v.add(true);
        v.add(false);
        v.add(true);
        v.add(false);

        System.out.println(v);
    }
}