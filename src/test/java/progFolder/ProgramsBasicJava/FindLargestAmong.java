package progFolder.ProgramsBasicJava;

//import org.testng.annotations.Test;

public class FindLargestAmong 
{
//	@Test
	public void test()
	{
		int a = 5,b =-4,c=-1;
		
		int largest = a;
		
		if(b>a)
		{
			largest = b;
			if(c>b)
			{
				largest = c;
			}
		}
		
		if(c>a)
		{
			largest = c;
		}
		
		System.out.println("Largest ="+largest);
	}
}
