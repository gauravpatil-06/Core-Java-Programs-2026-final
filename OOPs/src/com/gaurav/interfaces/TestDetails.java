package com.gaurav.interfaces;

public class TestDetails implements Test1, Test2, Test3
{
	@Override
	public void test1()
	{
		System.out.println("Test1 method executed successfully");
	}
	
	@Override
	public void test2() 
	{
		System.out.println("Test2 method executed successfully");
	}
	
	@Override
	public void test3() 
	{
		System.out.println("Test3 method executed successfully");
	}
	
	public static void main(String[] args)
	{
		TestDetails t1 = new TestDetails();
		
		t1.test1();
		t1.test2();
		t1.test3();
	}
}