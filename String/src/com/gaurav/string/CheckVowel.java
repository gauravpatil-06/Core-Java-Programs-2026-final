package com.gaurav.string;

public class CheckVowel 
{
	public static void main(String[] args) 
	{
		String str = "I am Gaurav Patil";
		
		char ch[] = str.toCharArray();
		
		int count = 0;
		
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' ||
			   ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
			{
				count++;
			}
		}
		
		System.out.println("Total Vowels: " + count);
	}
}