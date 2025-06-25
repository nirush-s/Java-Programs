//package strings;
//
//import java.util.Scanner;
//
//import org.testng.annotations.Test;
//
//public class FindDuplicatesInString
//{
//
//
//	@Test
//	public void findDuplicate()
//	{
//
//
//		Scanner sc = new Scanner(System.in);
//
//		String str = sc.next();
//
//		char[] charArr = str.toCharArray();
//
//		System.out.println(charArr);
//
//		int length = charArr.length;
//
//		for(int i=0;i<length;i++)
//		{
//
//			for(int j= i+1; j<length;j++)
//			{
//
//				if(charArr[i]==charArr[j] && i != j)
//				{
//					System.out.println(charArr[j]);
//
//				}
//			}
//
//
//
//
//		}
//
//		sc.close();
//
//	}
//
//
//
//
//}
