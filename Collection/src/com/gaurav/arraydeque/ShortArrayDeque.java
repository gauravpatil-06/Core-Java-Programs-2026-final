package com.gaurav.arraydeque;

import java.util.ArrayDeque;

public class ShortArrayDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Short> dq = new ArrayDeque<Short>();

        dq.add((short)1);
        dq.add((short)2);
        dq.add((short)3);
        dq.add((short)4);
        dq.add((short)5);
        dq.add((short)6);
        dq.add((short)7);
        dq.add((short)8);
        dq.add((short)9);
        dq.add((short)10);

        System.out.println(dq);
    }
}