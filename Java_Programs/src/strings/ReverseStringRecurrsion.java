package strings;

public class ReverseStringRecurrsion 
{
	
	
	public static String reverse(String name)
	{
		
		if(name.isEmpty())
		{
			return name;
			
		}
		
	
			
			return reverse(name.substring(1)) + name.charAt(0);
		
		
	
	}
	
	

	public static void main(String[] args)
	{
		
		String name = "Geeks for Geeks";

		String reverse_name = reverse(name);
		
		System.out.println(reverse_name);
		
	}
	
	
}
