package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class ListClass 
{
	@Test
	public void listMethods()
	{
		
		List<String> list = new ArrayList<String>();
		
		list.add(0, "Test");
		list.add(1, "Test2");
		list.add("Test3");
		list.add("Test3");
		list.add("Test3");
		list.add("Test3");
		list.add("Test3");
		list.add("Test3");
		list.add("Test3");
		list.add("Test3");
		list.add("Test3");
		list.add("Test3");
		
		
/*		for(String s: list)
		{
			System.out.println(s);
			
		}*/
		
		ListIterator<String> lt = list.listIterator();
		
		while(lt.hasNext())
		{
			
			String s = lt.next();
			System.out.println(s);
			
		}
		
		System.out.println("Now set");
		
		Set<String> set = new HashSet<String>(list);
		
	//	set.addAll(list);
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			
			String s = itr.next();
			System.out.println(s);
			
		}
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("t", "t-value");
		map.put("k", "K-value");
		
/*		Iterator<String> itrm = map.values().iterator();
		
		for(Map.Entry<String,String> entry : map.entrySet())
		{
			
		}*/
		
		
	}
	
	
}
