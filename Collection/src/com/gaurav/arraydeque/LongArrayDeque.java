package com.gaurav.arraydeque;

import java.util.ArrayDeque;

public class LongArrayDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Long> dq = new ArrayDeque<Long>();

        dq.add(1000000000000000L);
        dq.add(2000000000000000L);
        dq.add(3000000000000000L);
        dq.add(4000000000000000L);
        dq.add(5000000000000000L);
        dq.add(6000000000000000L);
        dq.add(7000000000000000L);
        dq.add(8000000000000000L);
        dq.add(9000000000000000L);
        dq.add(10000000000000000L);

        System.out.println(dq);
    }
}