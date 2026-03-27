package com.gaurav.stack;

import java.util.Stack;

public class ByteStack
{
    public static void main(String[] args)
    {
        Stack<Byte> s = new Stack<Byte>();

        s.push((byte)1);
        s.push((byte)2);
        s.push((byte)3);
        s.push((byte)4);
        s.push((byte)5);
        s.push((byte)6);
        s.push((byte)7);
        s.push((byte)8);
        s.push((byte)9);
        s.push((byte)10);

        System.out.println(s);
    }
}