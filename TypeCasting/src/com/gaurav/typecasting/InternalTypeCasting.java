package com.gaurav.typecasting;

public class InternalTypeCasting {

    public static void main(String[] args) {

        // Smallest data type
        byte b = 10;                 // 1 byte

        // Automatic widening
        short s = b;                 // byte → short
        int i = s;                   // short → int
        long l = i;                  // int → long
        float f = l;                 // long → float
        double d = f;                // float → double

        // Printing all values
        System.out.println("byte value   : " + b);
        System.out.println("short value  : " + s);
        System.out.println("int value    : " + i);
        System.out.println("long value   : " + l);
        System.out.println("float value  : " + f);
        System.out.println("double value : " + d);
    }
}