package strings;

import java.util.Scanner;

import org.testng.annotations.Test;

public class CountNumberOfM 
{
	
	public void test() //works without space
	{
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		
		char[]  charArr = str.toCharArray();
		
		//Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		int count =0;
		
		int length = charArr.length;
		
		System.out.println(length);
		
		for(int i=0; i<length; i++)
		{
			
			if(charArr[i]=='M')
			{				
				count++;
			}
	
		}
		
		System.out.println(count);
		
		sc.close();
 		
	}
	
	@Test
	public void test1()
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String[] strArr = str.split("M");
		
		int length = strArr.length;
		
		System.out.println(length);
		
		sc.close();
		
	}
	
}
