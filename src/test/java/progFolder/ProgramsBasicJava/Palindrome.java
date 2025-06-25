package progFolder.ProgramsBasicJava;

import java.util.Scanner;

public class Palindrome 
{

	public void stringPalindrom()
	{
		
		Scanner sc = new Scanner(System.in);
		
		String string = sc.next();
		
		String reverseString = "" ;
		
		char[] charArray = string.toCharArray();
		
		int length = charArray.length;
		
		for (int i =length-1; i>=0;i--)
		{
			
			reverseString = reverseString + charArray[i];
			
		}
		
		System.out.println(reverseString);
		
		if(string.equalsIgnoreCase(reverseString))
		{
			System.out.println("It is Palindrome");
			
		}
		
		else 
		{
			
			System.out.println("Not");
		}
		
		sc.close();
	}
	
	public void numberPalindrom()
	{
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int remainder, reverse=0;
		
		int temp = num;   // This is because num will change once it goes in. so not comparing with that.
		
		while(num>0)
		{
			// R + M + D
			
			remainder = num % 10;      
			
			reverse = (reverse * 10) + remainder;
			
			num = num/10;

		}
		
		if(temp == reverse)
		{
			System.out.println("Palindrome");
		}
		
		else 
			
		{
			System.out.println("Not");
		}
		
		sc.close();

	}
	
	
	
	
	
	
	
	
	
	
}
