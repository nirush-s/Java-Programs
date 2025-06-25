//package arrays;
//
//import org.testng.annotations.Test;
//
//public class MissingIntegerInArray
//{
//
//
//	// Logic is take sum of all the numbers and subtract with the expected and the difference is that number
//
//	@Test
//	public void test()
//	{
//
//
//
//		int[] arry = new int[] {1,2,4,5};
//
//
//		int actSum=0;
//		int expSum=0;
//
//		System.out.println("Array =" + arry.length);
//
//		for(int i=0;i<arry.length;i++)
//		{
//
//			actSum= actSum + arry[i];
//
//		}
//
//		System.out.println("Actual sum =" + actSum);
//
//		for(int j=1;j<=5;j++)
//		{
//
//			expSum = expSum + j;
//
//		}
//
//		System.out.println("Exp sum =" + expSum);
//
//		int diff = expSum - actSum;
//
//		System.out.println(diff);
//
//
//
//	}
//
//
//}
