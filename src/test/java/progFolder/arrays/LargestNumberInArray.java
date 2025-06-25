package progFolder.arrays;

import java.util.Scanner;

public class LargestNumberInArray 
{

	public void largestNumberInArray()
	{
		
		Scanner sc =  new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] i = new int[n];
		
		for(int k=0; k<n; k++)
		{
			i[k] = sc.nextInt();
			
		}
		
		int large = i[0];
		
		for(int j=0; j<n ; j++)
		{
			if(i[j] > large)
			{
				large = i[j];
			}
					
		}
		
		System.out.println(large);
		
		sc.close();
		
	}
	
	
}
