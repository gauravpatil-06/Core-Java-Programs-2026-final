package com.gaurav.constructor;

public class CopyConstructor 
{
	int id;
	String name;

	CopyConstructor(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	// Copy Constructor
	CopyConstructor(CopyConstructor obj)
	{
		id = obj.id;
		name = obj.name;
	}

	void display()
	{
		System.out.println("ID   : "+id);
		System.out.println("Name : "+name);
	}

	public static void main(String[] args)
	{
		CopyConstructor obj1 = new CopyConstructor(101, "Gaurav");

		CopyConstructor obj2 = new CopyConstructor(obj1);

		obj2.display();
	}
}
