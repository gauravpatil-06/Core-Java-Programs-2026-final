package com.gaurav.linkedlist;

import java.util.LinkedList;

public class LongLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Long> ll = new LinkedList<Long>();

        ll.add(1000000000000000L);
        ll.add(2000000000000000L);
        ll.add(3000000000000000L);
        ll.add(4000000000000000L);
        ll.add(5000000000000000L);
        ll.add(6000000000000000L);
        ll.add(7000000000000000L);
        ll.add(8000000000000000L);
        ll.add(9000000000000000L);
        ll.add(10000000000000000L);

        System.out.println(ll);
    }
}