package com.gaurav.string;

public class StringMethods
{
	public static void main(String[] args)
	{
		// Creating String objects
		String str  = "Gaurav Patil";
		String str1 = "Gaurav Patil";
		String str2 = "     ";                 // blank string
		String str3 = "Gaurav";
		String str4 = "     Gaurav      ";     // string with spaces

		// length()
		System.out.println("Length of String : " + str.length());

		// toUpperCase() and toLowerCase()
		System.out.println("Upper Case       : " + str.toUpperCase());
		System.out.println("Lower Case       : " + str.toLowerCase());

		// concat()
		System.out.println("Concat String    : " + str.concat(" Jalgaon"));

		// equals() and equalsIgnoreCase()
		System.out.println("Equals           : " + str.equals(str1));
		System.out.println("Equals IgnoreCase: " + str.equalsIgnoreCase("gaurav patil"));

		// == operator (reference [Address] comparison)
		System.out.println("== Operator      : " + (str == str1));

		// charAt()
		System.out.println("Char At index 0  : " + str.charAt(0));

		// indexOf() and lastIndexOf()
		System.out.println("Index Of 'G'     : " + str.indexOf('G'));
		System.out.println("Last Index Of 'a': " + str.lastIndexOf('a'));

		// startsWith() and endsWith()
		System.out.println("Starts With      : " + str.startsWith("Gaurav"));
		System.out.println("Ends With        : " + str.endsWith("Patil"));

		// contains()
		System.out.println("Contains Gaurav  : " + str.contains("Gaurav"));

		// isEmpty() and isBlank()
		System.out.println("Is Empty         : " + str2.isEmpty());
		System.out.println("Is Blank         : " + str2.isBlank());

		// replace()
		System.out.println("Replace String   : " + str3.replace("Gaurav", "Patil"));

		// trim()
		System.out.println("Before Trim      : '" + str4 + "'");
		System.out.println("After Trim       : '" + str4.trim() + "'");

		// compareTo() and compareToIgnoreCase()
		System.out.println("CompareTo        : " + str3.compareTo("Gaurav"));
		System.out.println("CompareTo        : " + str3.compareTo("gaurav"));
		System.out.println("CompareToIgnore  : " + str3.compareToIgnoreCase("gaurav"));

		// substring()
		System.out.println("Substring (3)    : " + str.substring(3));
		System.out.println("Substring (3,10) : " + str.substring(3, 10));

		// split()
		String[] words = str.split(" ");
		System.out.println("Split Result     : ");
		for(String w : words)
		{
			System.out.println(w);
		}
	}
}