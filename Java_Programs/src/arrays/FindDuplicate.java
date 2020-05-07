package arrays;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FindDuplicate 
{

	@Test
	public void findDuplicate()
	{
		
		 char[] arr = new char[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i] = sc.next().charAt(0);
			
		}
		
		for(int i=0; i<arr.length; i++)
		{
			
			
			for(int j=i+1; j<arr.length; j++)
			{
				
				if(arr[i] ==arr[j] && i != j)
				{
					System.out.println(arr[j]);
					
				}
				
			}
	
		
		}
		
		sc.close();
		
	}
	
	
}
