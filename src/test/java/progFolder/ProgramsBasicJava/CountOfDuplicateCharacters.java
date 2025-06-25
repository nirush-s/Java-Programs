package progFolder.ProgramsBasicJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;

public class CountOfDuplicateCharacters 
{
	@Test
	public void test()
	{
		
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int i = 0; i < s.length(); i++) 
			{
				char c = s.charAt(i);
				if (map.containsKey(c))
					{
						int cnt = map.get(c);  //basically this is 0
						map.put(c,cnt+1);
					}	 
				else 
					{
						map.put(c, 1);
					}
			}
		
			System.out.println(map);	
			
			sc.close();
		
		}
	
	
}
