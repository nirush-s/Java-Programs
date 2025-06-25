package progFolder.arrays;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SumAndAverageOfArray 
{
	@Test
	public void test() 
	{
	
		int [] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i] = sc.nextInt();		
			
		}
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			sum = sum + arr[i];
			
		}
		
		System.out.println(sum);
		
		sc.close();
		
	}
	
	
}
