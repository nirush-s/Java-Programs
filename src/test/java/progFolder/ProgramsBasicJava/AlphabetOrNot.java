package progFolder.ProgramsBasicJava;

//import org.testng.annotations.Test;

public class AlphabetOrNot 
{
//	@Test
	public void test()
	{
		
		char input = '@';
		
		if(( input >='a' && input<='z') ||( input >='A' && input<='Z'))
		{
			System.out.println("The input character is a 'Charater'");
		}
		else
		{
			System.out.println("NOT");
		}
	}
	
}
