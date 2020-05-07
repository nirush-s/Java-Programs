package arrays;

import java.util.HashMap;
import java.util.Scanner;

import org.testng.annotations.Test;


public class FindNumberOfDuplicatesInArray 
{

	@Test
	public void test()
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];

		HashMap<Integer, Integer>  map = new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			
			arr[i] = sc.nextInt();
			
		}
		
		for(int j=0; j<n;j++)
		{
			
			if(map.containsKey(arr[j]))
			{
				map.put(arr[j],map.get(arr[j])+1);
			}
			
			else
			{
				map.put(arr[j], 1);
			}
		}
		
		System.out.println(map);
		sc.close();
		
	}
	
}
