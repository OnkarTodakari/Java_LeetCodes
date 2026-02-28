/*
1662. Check If Two String Arrays are Equivalent

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true
*/
import java.util.*;
class EquivalentString
{
     public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
		
	 String str1[]={"ab","c"};
	 String str2[]={"a","bc"};
		String s1=" ";
		for(int i=0;i<str1.length;i++)
		{
		     s1=s1+str1[i];
		}
		String s2=" ";
		for(int i=0;i<str2.length;i++)
		{
		  s2=s2+str2[i];
		}
		if(s2.equals(s1))
		{
		   System.out.println("true");
		}
		else
		{
		  System.out.println("False");
		}
	 }
}