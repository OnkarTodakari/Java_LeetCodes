/*
1528. Shuffle String

Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
*/
import java.util.*;
class ShuffleCode
{
     public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String word");
		String str=sc.nextLine();
		int n=str.length();
		int a[]=new int[n];
	
		for(int i=0;i<n;i++)
		{
		  a[i]=sc.nextInt();
		}
		char ch[]=new char[n];
		
		for(int i=0;i<n;i++)
		{
			ch[a[i]]=str.charAt(i);
		}
		System.out.println("Shuffled String is");
		System.out.println(new String(ch));
		
	 }
}