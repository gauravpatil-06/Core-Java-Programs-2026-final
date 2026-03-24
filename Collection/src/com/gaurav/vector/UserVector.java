package com.gaurav.vector;

import java.util.Vector;

public class UserVector
{
	public static void main(String[] args)
	{
		Vector<User> user = new Vector<User>();

		user.add(new User(101, "gaurav", "gaurav@gmail.com", "pass123", 9876543210L));
		user.add(new User(102, "vinod", "vinod@yahoo.com", "pass456", 8765432109L));
		user.add(new User(103, "akash", "akash@gmail.com", "pass789", 9123456789L));
		user.add(new User(104, "suraj", "suraj@gmail.com", "pass111", 8899776655L));
		user.add(new User(105, "abhishek", "abhi@gmail.com", "pass222", 9988776655L));

		for (User u : user)
		{
			if (u.getEmail().endsWith("@gmail.com") && u.getMobileNumber() > 9000000000L)
			{
				u.display();
			}
		}
	}
}