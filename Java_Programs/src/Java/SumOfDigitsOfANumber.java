package Java;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SumOfDigitsOfANumber {

	@Test
	public void sumOfGivenNumber()
	{
		
		Scanner sc =  new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		while(n>0)
		{
			
			
			sum = sum + n % 10;
			n = n/10;
			
		}
		
		System.out.println(sum);
		sc.close();
		
		
	}
	
	
}
