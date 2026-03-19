package com.gaurav.vector;

import java.util.Vector;

public class ByteVector
{
    public static void main(String[] args)
    {
        Vector<Byte> v = new Vector<Byte>();

        v.add((byte)1);
        v.add((byte)2);
        v.add((byte)3);
        v.add((byte)4);
        v.add((byte)5);
        v.add((byte)6);
        v.add((byte)7);
        v.add((byte)8);
        v.add((byte)9);
        v.add((byte)10);

        System.out.println(v);
    }
}