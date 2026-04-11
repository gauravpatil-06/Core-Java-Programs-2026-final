package com.gaurav.arraydeque;

import java.util.ArrayDeque;

public class FloatArrayDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Float> dq = new ArrayDeque<Float>();

        dq.add(10.5f);
        dq.add(20.5f);
        dq.add(30.5f);
        dq.add(40.5f);
        dq.add(50.5f);
        dq.add(60.5f);
        dq.add(70.5f);
        dq.add(80.5f);
        dq.add(90.5f);
        dq.add(100.5f);

        System.out.println(dq);
    }
}