package com.gaurav.arraydeque;

import java.util.ArrayDeque;

public class IntegerArrayDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(50);
        dq.add(60);
        dq.add(70);
        dq.add(80);
        dq.add(90);
        dq.add(100);

        System.out.println(dq);
    }
}