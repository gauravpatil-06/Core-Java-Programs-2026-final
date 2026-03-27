package com.gaurav.stack;

import java.util.Stack;

public class BooleanStack
{
    public static void main(String[] args)
    {
        Stack<Boolean> s = new Stack<Boolean>();

        s.push(true);
        s.push(false);
        s.push(true);
        s.push(false);
        s.push(true);
        s.push(false);
        s.push(true);
        s.push(false);
        s.push(true);
        s.push(false);

        System.out.println(s);
    }
}