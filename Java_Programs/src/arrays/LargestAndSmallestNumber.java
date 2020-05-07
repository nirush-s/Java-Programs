package arrays;

import java.util.Scanner;

import org.testng.annotations.Test;

public class LargestAndSmallestNumber 
{
	
	@Test
	public void test()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			
			arr[i] = sc.nextInt();
			
		}
		
		int large = arr[0];
		
		for(int i=0;i<n;i++)
		{
			
			if(arr[i] > large)
			{
				large = arr[i];
				
			}
			
			
		}
		
		System.out.println("Largest Number is" + large);
		
		int small = arr[0];
		
		for(int i=0;i<n;i++)
		{
			
			if(arr[i] < small)
			{
				small = arr[i];
				
			}
			
			
		}
		
		System.out.println("Smallest Number is" + small);
		
		sc.close();
		
	}
	
	

}
