package com.gaurav.stack;

import java.util.Stack;

public class CharacterStack
{
    public static void main(String[] args)
    {
        Stack<Character> s = new Stack<Character>();

        s.push('A');
        s.push('B');
        s.push('C');
        s.push('D');
        s.push('E');
        s.push('F');
        s.push('G');
        s.push('H');
        s.push('I');
        s.push('J');

        System.out.println(s);
    }
}