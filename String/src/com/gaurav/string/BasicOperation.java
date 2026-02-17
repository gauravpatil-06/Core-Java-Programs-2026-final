package com.gaurav.string;

public class BasicOperation
{
	public static void main(String[] args)
	{
		// String Literal (Immutable)
		String city1 = "Pune";

		// concat() returns new String, original string does NOT change
		String updatedCity = city1.concat(" Mumbai");

		System.out.println("After concat (String Literal) : " + updatedCity);
		System.out.println("Original String city1         : " + city1);

		System.out.println("-------------------------------------------");

		// StringBuilder (Mutable, Not Thread-Safe)
		StringBuilder sb = new StringBuilder("Pune");
		sb.append(" Mumbai");   // modifies same object

		System.out.println("StringBuilder Result          : " + sb);

		System.out.println("-------------------------------------------");

		// StringBuffer (Mutable, Thread-Safe)
		StringBuffer sf = new StringBuffer("Pune");
		sf.append(" Mumbai");   // modifies same object

		System.out.println("StringBuffer Result           : " + sf);

		System.out.println("-------------------------------------------");

		// String Object using new keyword (Immutable)
		String str = new String("Pune");
		str.concat(" Mumbai");   // new object created but NOT assigned

		System.out.println("String Object (new keyword)   : " + str);
		
		System.out.println("-------------------------------------------");
	}
}