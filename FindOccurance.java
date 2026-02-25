/*
28. Find the Index of the First Occurrence in a String
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
*/
import java.util.*;
class FindOccurance
{
     public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word");
		String str=sc.nextLine();
		
		System.out.println("Enter a compare word");
		String data=sc.next();
		int result=-1;
		for(int i=0;i<=str.length()-data.length();i++)
		{
		     if(str.substring(i,i+data.length()).equals(data))
			 {
				 result=i;
				 break;
			 }
		}
		System.out.println("Index :"+result);
	 }
}

