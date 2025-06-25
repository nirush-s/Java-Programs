//package arrays;
//
//import java.util.Scanner;
//
//import org.testng.annotations.Test;
//
//public class CheckWhetherANoIsPresentInArray
//{
//
//	//logic :
//
//	@Test
//	public void test()
//	{
//
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//
//		int[] arr = new int[n];
//
//		boolean isPresent = false;
//
//		for(int i=0;i<n;i++)
//		{
//
//			arr[i] = sc.nextInt();
//
//		}
//
//		int num = sc.nextInt();
//
//		for(int j=0;j<n;j++)
//		{
//
//			if(num == arr[j])
//			{
//				isPresent = true;
//			}
//
//		}
//
//		if(isPresent)
//		{
//			System.out.println("Present");
//		}
//
//		else
//		{
//			System.out.println("Not Present");
//		}
//
//		sc.close();
//
//	}
//
//}
