package Java;

import java.util.Scanner;

public class SwapAndPrime 
{

	public void withoutThirdVariable()
	{
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();     //5
		int y = sc.nextInt();		// 3	
		
		x = x+y;					// 8
		y = x-y;					// 5
		x = x-y;					// 3
		
		sc.close();

	}
	
	public void prime()
	{
		
		Scanner sc = new Scanner(System.in);
		int y;
		boolean isPrime = true;
		int x = sc.nextInt();

		
		for(int i=2; i<=x/2; i++)
		{
			
			y = x % i;
			
			if(y == 0)
			{
				isPrime = false;
				break;
			}
			
		}
		
		if(isPrime)
		{
			System.out.println("This is prime number");
		}
		
		else
		{
			System.out.println("This is not prime");
		}
		
		sc.close();
		
	}
	

	



	
	
}
