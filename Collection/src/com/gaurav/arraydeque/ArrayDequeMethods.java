package com.gaurav.arraydeque;

import java.util.ArrayDeque;

public class ArrayDequeMethods
{
    public static void main(String[] args)
    {
        // Create ArrayDeque objects
        ArrayDeque<String> dq = new ArrayDeque<String>();   // Main Deque
        ArrayDeque<String> dq2 = new ArrayDeque<String>();  // Second Deque

        // add() → Adds elements at last
        dq.add("Gaurav");
        dq.add("Vinod");
        dq.add("Bhagyesh");
        dq.add("Suraj");
        dq.add("Vikas");

        // add() elements to second deque
        dq2.add("Gaurav");
        dq2.add("Vinod");
        dq2.add("Bhagyesh");

        // peek() → Returns first element, does NOT remove
        System.out.println("peek(): " + dq.peek());

        // peekFirst() → Returns first element
        System.out.println("peekFirst(): " + dq.peekFirst());

        // peekLast() → Returns last element
        System.out.println("peekLast(): " + dq.peekLast());

        // pollFirst() → Removes and returns first element
        System.out.println("pollFirst(): " + dq.pollFirst());
        System.out.println("After pollFirst(): " + dq);

        // pollLast() → Removes and returns last element
        System.out.println("pollLast(): " + dq.pollLast());
        System.out.println("After pollLast(): " + dq);

        // size()
        System.out.println("size(): " + dq.size());

        // contains()
        System.out.println("contains(): " + dq.contains("Vinod"));

        // addAll()
        dq.addAll(dq2);
        System.out.println("addAll(): " + dq);

        // remove(object)
        dq.remove("Vinod");
        System.out.println("remove(object): " + dq);

        // removeAll()
        dq.removeAll(dq2);
        System.out.println("removeAll(): " + dq);

        // equals()
        System.out.println("equals(): " + dq.equals(dq2));

        // toArray()
        Object[] arr = dq.toArray();
        System.out.println("toArray length: " + arr.length);

        // clear()
        dq.clear();
        System.out.println("clear(): " + dq);

        // isEmpty()
        System.out.println("isEmpty(): " + dq.isEmpty());
    }
}