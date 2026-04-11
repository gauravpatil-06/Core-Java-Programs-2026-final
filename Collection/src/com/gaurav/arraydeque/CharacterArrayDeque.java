package com.gaurav.arraydeque;

import java.util.ArrayDeque;

public class CharacterArrayDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Character> dq = new ArrayDeque<Character>();

        dq.add('A');
        dq.add('B');
        dq.add('C');
        dq.add('D');
        dq.add('E');
        dq.add('F');
        dq.add('G');
        dq.add('H');
        dq.add('I');
        dq.add('J');

        System.out.println(dq);
    }
}