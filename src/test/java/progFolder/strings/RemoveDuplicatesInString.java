//package strings;
//
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//import org.testng.annotations.Test;
//
//public class RemoveDuplicatesInString {
//
//	@Test
//	public void duplicateCharactersInString()
//	{
//
//		Scanner sc = new Scanner(System.in);
//		String str =  sc.next();
//
//		StringBuilder sb = new StringBuilder();
//
//		sc.close();
//
//		char[] charArr = str.toCharArray();
//
//		for(int i=0; i<(charArr.length); i++)
//		{
//			for(int j=i+1; j<(charArr.length); j++)
//			{
//				if(charArr[i]==charArr[j])
//				{
//
//					sb.deleteCharAt(i);
//
//				}
//
//
//			}
//		}
//
//		System.out.println(sb);
//
//	}
//
//	public void duplicateStringHashset()
//	{
//
//		Scanner sc = new Scanner(System.in);
//		String str =  sc.next();
//		sc.close();
//
//		Set<Character> set = new HashSet<Character>();
//		StringBuffer strbff = new StringBuffer();
//
//		for(int i=0; i< str.length(); i++)
//		{
//
//			 char character = str.charAt(i);
//
//			 if(!set.contains(character))
//			 {
//				 set.add(character);
//				 strbff.append(character);
//			 }
//
//
//		}
//
//		System.out.println(strbff);
//
//	}
//
//}
