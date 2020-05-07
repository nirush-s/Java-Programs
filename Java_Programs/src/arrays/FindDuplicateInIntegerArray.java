package arrays;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FindDuplicateInIntegerArray 
{
	
	//Logic : compare 2 indexes (i and j+i, if they are equal then print it)

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
		
		for(int j=0;j<n;j++)
		{
			
			for(int k=j+1;k<n;k++)
			{
				
				if(arr[j]==arr[k] && j!=k)
				{
					System.out.println(arr[j]);
				}
				
			}
			
		}
		
		sc.close();
		
		
	}
	
	
	
}
