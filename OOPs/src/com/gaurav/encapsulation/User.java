package com.gaurav.encapsulation;

public class User
{
	// Private data members (Data Hiding)
	private String username;
	private String password;

	// Getter method for username
	public String getUsername()
	{
		return username;
	}

	// Setter method for username with validation
	public void setUsername(String username)
	{
		if(username != null && username.length() >= 5)
		{
			this.username = username;
		}
		else
		{
			System.out.println("Username must be at least 5 characters long");
		}
	}

	// Getter method for password
	public String getPassword()
	{
		return password;
	}

	// Setter method for password with validation
	public void setPassword(String password)
	{
		if(password != null && password.length() >= 8)
		{
			this.password = password;
		}
		else
		{
			System.out.println("Password must be at least 8 characters long");
		}
	}
}