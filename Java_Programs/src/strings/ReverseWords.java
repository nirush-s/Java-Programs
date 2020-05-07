package strings;

import org.testng.annotations.Test;

public class ReverseWords 
{

	@Test
	public void reverseWords()
	{
		
		String str = "I am Nirush";
		
		String ans = "";
		
		String[] s  = str.split(" ");
		
		for(int i = s.length-1; i>=0;i--)
		{
			ans = ans + s[i] +" ";
	
		}
		
		System.out.println(ans);

		
	}
	
	
	
	
}
