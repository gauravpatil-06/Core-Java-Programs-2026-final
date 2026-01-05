package com.gaurav.operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 10;

        // Unary plus
        System.out.println("Unary plus (+a) : " + (+a));

        // Unary minus
        System.out.println("Unary minus (-a) : " + (-a));

        // Pre-increment: increase first, then print
        System.out.println("Pre-increment (++a) : " + (++a));

        // Post-increment: print first, then increase
        System.out.println("Post-increment (a++) : " + (a++));
        System.out.println("Value after post-increment : " + a);

        // Pre-decrement: decrease first, then print
        System.out.println("Pre-decrement (--a) : " + (--a));

        // Post-decrement: print first, then decrease
        System.out.println("Post-decrement (a--) : " + (a--));
        System.out.println("Value after post-decrement : " + a);
    }
}
