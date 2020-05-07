package arrays;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseAnArray 
{

	
	public void test()
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = new char[n];
		

		
		for(int i=0; i<n;i++)
		{
			
			arr[i] = sc.next().charAt(0);
		}
		
 		
 		char temp;
 		
 		for(int left =0; left<n; left++, n--)
 		{
 			
 			temp = arr[left];
 			arr[left] = arr[n-1];
 			arr[n-1] = temp;
 	
 		}
 		
 		for(char c:arr)

 		System.out.println(c);
 			
 		sc.close();

	}
	
	@Test
	public void reverseStringArray()
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] str = new String[n];
		
		for(int i=0;i<n;i++)
		{
			
			str[i] = sc.next();
			
		}
		
		for(String s:str)
		{
			System.out.println(s);
		}
		
		String temp = "";
		int left=0;
		
		for(left=0; left<n;left++,n--)
		{
			
			temp.equals(str[left]);
			str[left].equals(str[n-1]);
			str[n-1].equals(temp);
			
		}
		
		for(String s:str)
		{
			System.out.println(s);
		}
		
		sc.close();
	}
	
}
