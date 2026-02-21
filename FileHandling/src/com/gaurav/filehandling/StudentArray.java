package com.gaurav.filehandling;

public class StudentArray 
{
	public static void main(String[] args) 
	{
		Students s1 = new Students();
		s1.setId(101);
		s1.setName("Gaurav");
		s1.setAddress("Pune");
		s1.setAge(19);
		s1.setCollegeName("DYPCOE");
		
		Students s2 = new Students();
		s2.setId(102);
		s2.setName("Vinod");
		s2.setAddress("Pune");
		s2.setAge(20);
		s2.setCollegeName("PVG");
		
		Students s3 = new Students();
		s3.setId(103);
		s3.setName("Bhagyesh");
		s3.setAddress("Pune");
		s3.setAge(18);
		s3.setCollegeName("DYPCOE");
		
		Students[] stud = new Students[3];
		
		stud[0] = s1;
		stud[1] = s2;
		stud[2] = s3;
		
		for (Students s : stud)
		{
			System.out.println("------------------------");
			System.out.println("Student ID      : "+s.getId());
			System.out.println("Student Name    : "+s.getName());
			System.out.println("Student Address : "+s.getAddress());
			System.out.println("Student Age     : "+s.getAge());
			System.out.println("College Name    : "+s.getCollegeName());
			System.out.println("------------------------");
		}
		
//		for(int i=0; i<3; i++)
//		{
//			System.out.println("------------------------");
//			System.out.println("Student ID      : "+s[i].getId());
//			System.out.println("Student Name    : "+s[i].getName());
//			System.out.println("Student Address : "+s[i].getAddress());
//			System.out.println("Student Age     : "+s[i].getAge());
//			System.out.println("College Name    : "+s[i].getCollegeName());
//			System.out.println("------------------------");
//		}
	}
}
