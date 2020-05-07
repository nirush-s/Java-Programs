package collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class HashMapTest 
{

	
	
	public void createDifferentWaysOfHashMap()
	{
		
		
		// 1. Create HashMap with default initial capacity and load factor
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		
		// 2. Create HashMap with 30 as initial capacity 
		
		@SuppressWarnings("unused")
		HashMap<String, String> map2 = new HashMap<String, String>(30);
		
		// 3. Create HashMap with 30 as initial capacity and 0.5 as load factor
		@SuppressWarnings("unused")
		HashMap<String, String> map3 = new HashMap<String, String>(30, 0.5f);
		
		// 4. Create HashMap by copying another HashMap
		@SuppressWarnings("unused")
		HashMap<String, String> map4 = new HashMap<String, String>(map1);
		
	}
	

	public void puttingValuesHashMap()
	{
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("1","j");
		map.put("3","k");
		map.put("2","a");
		
		//1.
		System.out.println(map);
		
		//2.
		System.out.println(map.entrySet());
		
		//3.
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			System.out.println("Key =" + entry.getKey());
			System.out.println("Value =" + entry.getValue());						
		}
		
		//4.
		for(String key: map.keySet())
		{
			System.out.println("Key =" + key);
		}
		
		for(String value : map.values())
		{
			System.out.println("Value =" + value);
		}
		
		
		//5.
		map.forEach((k,v)-> System.out.println("Key="+k + ",Value ="+v));
		
	}
	

	public void list() 
	{
		
		List<String> list = new ArrayList<String>();
		list.add("Test");
		list.add("Test1");
		
	//	list.set(index, element);
	//	list.size();
	//	list.remove(index);
	//	list.clear();;
	//	list.contains(o);
		
		int i = list.size();
		
//		String output = list.get(0);
		
		System.out.println(i);
		
	}
	
	@Test
	public void set()
	{
		
		Set<String> set = new HashSet<String>();
		
		set.add("Test");
		set.add("Test1");
		set.add("Test3");
		
		//set.clear();
		@SuppressWarnings("unused")
		Boolean i = set.contains("Test");
		
		List<String> list = new ArrayList<String>(set);
		
		System.out.println(list);
		
	//	System.out.println(i);
		
		
		
	}
	
}
