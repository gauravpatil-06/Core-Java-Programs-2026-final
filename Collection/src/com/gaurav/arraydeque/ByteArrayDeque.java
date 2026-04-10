package com.gaurav.arraydeque;

import java.util.ArrayDeque;

public class ByteArrayDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Byte> dq = new ArrayDeque<Byte>();

        dq.add((byte)1);
        dq.add((byte)2);
        dq.add((byte)3);
        dq.add((byte)4);
        dq.add((byte)5);
        dq.add((byte)6);
        dq.add((byte)7);
        dq.add((byte)8);
        dq.add((byte)9);
        dq.add((byte)10);

        System.out.println(dq);
    }
}