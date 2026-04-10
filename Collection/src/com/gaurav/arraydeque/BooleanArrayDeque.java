package com.gaurav.arraydeque;

import java.util.ArrayDeque;

public class BooleanArrayDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Boolean> dq = new ArrayDeque<Boolean>();

        dq.add(true);
        dq.add(false);

        System.out.println(dq);
    }
}