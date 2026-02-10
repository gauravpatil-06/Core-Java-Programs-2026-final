package com.gaurav.interfaces;

public interface Student
{
	// Public static final variables (constants)
	int id = 101;
	public static final int age = 19;

	// Abstract methods (by default public abstract)
	void login();
	void register();

	// Static method (can be called using interface name)
	static void display1()
	{
		System.out.println("Static method from Student interface called");
	}

	// Default method (can be called using object)
	default void display2()
	{
		System.out.println("Default method from Student interface called");
		display3(); // calling private method
	}

	// Private method (used only inside interface)
	private void display3()
	{
		System.out.println("Private method inside Student interface called");
	}
}