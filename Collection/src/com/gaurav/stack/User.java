package com.gaurav.stack;

public class User
{
	private int userId;
	private String username;
	private String email;
	private String password;
	private long mobileNumber;

	public User(int userId, String username, String email, String password, long mobileNumber)
	{
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}

	public void display()
	{
		System.out.println("User Id       : " + userId);
		System.out.println("Username      : " + username);
		System.out.println("Email         : " + email);
		System.out.println("Password      : " + password);
		System.out.println("Mobile Number : " + mobileNumber);
		System.out.println("--------------------------------");
	}

	public int getUserId()
	{
		return userId;
	}

	public String getUsername()
	{
		return username;
	}

	public String getEmail()
	{
		return email;
	}

	public String getPassword()
	{
		return password;
	}

	public long getMobileNumber()
	{
		return mobileNumber;
	}
}