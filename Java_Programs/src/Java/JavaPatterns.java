package Java;

import java.util.Scanner;

import org.testng.annotations.Test;

public class JavaPatterns
{

	
	public void pattern1()
	{
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i++)
		{
			
			
			for(int j=1;j<=i;j++)
			{
				System.out.println(j +"");
				
			}
			
			
			System.out.println();		
			
		}
		
		
	}
	
	public void pattern3()
	{
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n;i++)
		{
			
			for(int j=i;j<=i;j++)
			{
				
				System.out.println(i + "");
			}
		
			System.out.println();
			
		}
		
		
		
	}
	
	
	public void pattern5()
	{
		
		int n;	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n;i++)
		{
			
			for(int j=1;j<=(n-i)+1;j++)
			{
				
				System.out.print(j + "");
			}
		
			System.out.println();
						
		}
	}
	

	public void pattern6()
	{
		
		int n;	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		for(int i=n; i>=1; i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j + "");
				
			}
			
					
		}
		
		
	}
	

	public void starPattern2()
	{
		
		int n;	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();	
		
		for(int i=1; i<=n; i++)
		{
			
			for (int j=1; j<=i; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
		@Test
		public void starPattern3()
		{
			
			int n;	
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			sc.close();	
			
			int count = n-1;
			
			for(int i=1; i<=n; i++)
			{
				
				for(int k=1; k<=count; k++)
				{
					System.out.print(" ");
					count--;
				}
				
				
				for (int j=1; j<=i; j++ )
				{
					System.out.print("*");
				}
				System.out.println();
				
			}
	
	
	
	
	}
	
}
