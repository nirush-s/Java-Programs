//package arrays;
//
//import java.util.Scanner;
//
//import org.testng.annotations.Test;
//
//public class GreatestOfSumOf2Number
//{
//
//	@SuppressWarnings("null")
//	@Test
//	public void test()
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number of Elements");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//
//		int first=0,second = 0;
//		int[] sum = null;
//		int large = 0;
//
//		System.out.println("Enter Elements of Array");
//		for(int i=0;i<n;i++)
//		{
//
//			arr[i] = sc.nextInt();
//
//		}
//
//		for(int j=0;j<n;j++)
//		{
//
//			 first = arr[j];
//			for(int k=j+1;k<n;k++)
//			{
//
//				 second = arr[j];
//				 for(int l=0;l<n;l++)
//				 {
//					 sum[l] = first + second;
//
//
//				 }
//
//				 large = sum[0];
//
//				 if(sum[j]>large)
//				 {
//
//					 large = sum[j];
//
//				 }
//
//
//
//			}
//
//			 System.out.println("The Largest sum is" + large);
//
//
//
//		}
//
//		sc.close();
//
//	}
//
//}
