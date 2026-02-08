package com.gaurav.encapsulation;

public class UserDetails
{
	public static void main(String[] args)
	{
		User u1 = new User();

		// Setting username
		u1.setUsername("gauravpatil");
		System.out.println("Username: " + u1.getUsername());

		// Setting password
		u1.setPassword("Gaurav@123");
		System.out.println("Password: " + u1.getPassword());
	}
}