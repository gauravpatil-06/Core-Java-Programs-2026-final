package com.gaurav.loopingstatement.whileloop;

public class InfiniteLoop 
{
	public static void main(String[] args)
	{
		//InfiniteLoop
		int i=1;
		while(i <= 10)
		{
			System.out.println("𝙂𝖆𝖚𝖗𝖆𝖛 𝕻𝖆𝖙𝖎𝖑");
		}
		
		//InfiniteLoop
		while(true)
		{
			System.out.println("𝙂𝖆𝖚𝖗𝖆𝖛 𝕻𝖆𝖙𝖎𝖑");
		}
		
		//Compilation Error
//		while(1 >= 10)
//		{
//			System.out.println("𝙂𝖆𝖚𝖗𝖆𝖛 𝕻𝖆𝖙𝖎𝖑");
//		}
		
		//No Output
		//Unreachable code
//		int i=1;
//		while(i >= 10) // false
//		{
//			System.out.println("𝙂𝖆𝖚𝖗𝖆𝖛 𝕻𝖆𝖙𝖎𝖑");
//		}
	}
}
