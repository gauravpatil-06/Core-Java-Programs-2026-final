package com.gaurav.string;

import java.util.Arrays;

public class PrimitiveDataTypeToString 
{
	public static void main(String[] args) 
	{
		int i[] = {10,20,30,40,50};
		System.out.println(Arrays.toString(i));

		float f[] = {10.1f,20.1f,30.1f,40.1f,50.1f};
		System.out.println(Arrays.toString(f));

		double d[] = {10.1,20.1,30.1,40.1,50.1};
		System.out.println(Arrays.toString(d));

		byte b[] = {10,20,30,40,50};
		System.out.println(Arrays.toString(b));

		short s[] = {10,20,30,40,50};
		System.out.println(Arrays.toString(s));

		long l[] = {100,200,300,400,500};
		System.out.println(Arrays.toString(l));

		boolean bool[] = {true, false, true, false, true};
		System.out.println(Arrays.toString(bool));

		char ch[] = {'G','A','U','R','A','V'};
		System.out.println(String.valueOf(ch));
	}
}