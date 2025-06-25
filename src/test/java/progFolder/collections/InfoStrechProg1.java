package progFolder.collections;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class InfoStrechProg1
{

	@Test
	public void test()
	{



		int[] arr3 = {5,5,2,1,3,7,9,6,2,5,1,5,4,2,9,5,10,2,4,5};

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		//HashMap<Integer,Integer> map = new HashMap<>()

		for(int i=0;i<arr3.length;i++)
		{



			if(map.containsKey(arr3[i]))
			{

				map.put(arr3[i], map.get(arr3[i])+1);

			}

			else
			{

				map.put(arr3[i], 1);   //5,2

			}


		}



		System.out.println("The Duplicates and Counts are" + map.entrySet());



		for(Map.Entry<Integer, Integer> entry :map.entrySet())
		{



			if(entry.getValue()>1)
			{

				System.out.print(entry.getKey());

			}

		}


	}



}
