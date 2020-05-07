package strings;

import java.util.Scanner;

import org.testng.annotations.Test;



public class ReverseString
{

	@Test
	public void reverseStringUsingCharArrayWithSwapping()
	{
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();  //Geek for Geek
		
		char[] charArray = str.toCharArray();
		
		int right = charArray.length-1;
		
		System.out.println(charArray.length);
		int left;
		
		for(left=0;left<=right;left++,right--) 
		{			
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;			
		}
		
		for(char c:charArray)
			System.out.print(c);
		
		sc.close();
		
	}
	

	public void reverseStringUsingCharArray()
	{
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse = "";
		
		char[] array = str.toCharArray();
		
		for(int i=array.length-1;i>=0;i--)
		{
			
			reverse = reverse + array[i];
					
		}
		
		System.out.println(reverse);
		sc.close();
		
	}
	
	public void reverseString_String()
	{
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String rev = "";
		
		int length = str.length();
		System.out.println(length);
		
		for(int i=length-1; i>=0; i--)
		{			
			rev = rev + str.charAt(i);			
		}
		
		sc.close();		
	}
	
	@Test
	public void reverseString_StringBuilder()
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		StringBuilder strBuilder = new StringBuilder(str);
		
		StringBuilder reverse_StrBuilder = strBuilder.reverse();
		
		String reverse = reverse_StrBuilder.toString();
		
		
		System.out.println(reverse);
		
		sc.close();

		
	}
	
	
	
}
