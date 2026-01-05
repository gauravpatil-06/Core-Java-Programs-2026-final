package com.gaurav.typecasting;

public class ExternalTypeCasting {

    public static void main(String[] args) {

        // Largest data type
        double d = 10.75;            // 8 bytes

        // Manual narrowing
        float f = (float) d;         // double → float
        long l = (long) f;           // float → long
        int i = (int) l;             // long → int
        short s = (short) i;         // int → short
        byte b = (byte) s;           // short → byte

        // Printing all values
        System.out.println("double value : " + d);
        System.out.println("float value  : " + f);
        System.out.println("long value   : " + l);
        System.out.println("int value    : " + i);
        System.out.println("short value  : " + s);
        System.out.println("byte value   : " + b);
    }
}