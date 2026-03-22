package com.gaurav.vector;

public class Employee
{
	private int empId;
	private String name;
	private double salary;
	private String department;
	private String city;

	public Employee(int empId, String name, double salary, String department, String city)
	{
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.city = city;
	}

	public void display()
	{
		System.out.println("Employee Id        : " + empId);
		System.out.println("Employee Name      : " + name);
		System.out.println("Employee Salary    : " + salary);
		System.out.println("Employee Department: " + department);
		System.out.println("Employee City      : " + city);
		System.out.println("--------------------------------");
	}

	public int getEmpId()
	{
		return empId;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}
}