package com.gaurav.hashset;

import java.util.HashSet;

public class CharacterHashSet
{
    public static void main(String[] args)
    {
        HashSet<Character> hs = new HashSet<>();

        hs.add('A');
        hs.add('B');
        hs.add('C');
        hs.add('D');
        hs.add('E');

        System.out.println(hs);
    }
}