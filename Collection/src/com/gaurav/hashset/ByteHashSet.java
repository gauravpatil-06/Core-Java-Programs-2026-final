package com.gaurav.hashset;

import java.util.HashSet;

public class ByteHashSet
{
    public static void main(String[] args)
    {
        HashSet<Byte> hs = new HashSet<>();

        hs.add((byte)1);
        hs.add((byte)2);
        hs.add((byte)3);
        hs.add((byte)4);
        hs.add((byte)5);
        hs.add((byte)6);
        hs.add((byte)7);
        hs.add((byte)8);
        hs.add((byte)9);
        hs.add((byte)10);

        System.out.println(hs);
    }
}