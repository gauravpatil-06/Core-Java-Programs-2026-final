package com.gaurav.arraydeque;

import java.util.ArrayDeque;

public class DoubleArrayDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Double> dq = new ArrayDeque<Double>();

        dq.add(100.50);
        dq.add(200.50);
        dq.add(300.50);
        dq.add(400.50);
        dq.add(500.50);
        dq.add(600.50);
        dq.add(700.50);
        dq.add(800.50);
        dq.add(900.50);
        dq.add(1000.50);

        System.out.println(dq);
    }
}