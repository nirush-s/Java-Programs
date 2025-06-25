package progFolder.arrays;

public class ArrayAscendingOrder 
{
	
	public void arrayAscending()
	{
		
		int[] i = {3,4,1,5,2,8,6};
		
		int length = i.length;
		int temp;
		System.out.println(length);
		
		for(int j=0; j<=length-1;j++)
		{
			
			for(int k = j+1; k<=length-1;k++)
			{
			
				if(i[j]>i[k])
				{
					temp = i[j];
					i[j] = i[k];
					i[k] = temp;
					
				}

			}
			
		}
 		
		for(int arrayValues : i )
		{
			System.out.println(arrayValues);
		}
		
		
		
	}

}
