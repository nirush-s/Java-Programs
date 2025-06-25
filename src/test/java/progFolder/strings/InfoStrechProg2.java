package progFolder.strings;

import org.testng.annotations.Test;

public class InfoStrechProg2
{

	@SuppressWarnings("unused")
	@Test
	public void test()
	{
		
		String[] str = {"U","D","D","U","D","D","U","D","U","U"};
		int level=0;
	

		
		int length = str.length;
		
		for(int i=0;i<length;i++)
		{
			
			if(str[i].equals("U"))
			{
				level++;   //level=0

			}
			
			else
			{
				level--; //
			}
			
			if(level==0)
			{
				int valleyCount = 0;
				valleyCount++;  // VC=3 
			}
			
		}
		

		
		
		
		
	}
	
}
