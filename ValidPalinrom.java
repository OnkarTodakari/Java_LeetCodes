/*
125. Valid Palindrome

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*/
import java.util.*;
class ValidPalinrom
{
     public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String line");
		String str=sc.nextLine();
		
		String s1=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
		    rev=rev+s1.charAt(i);
		}
		System.out.println("----------------------------------------");
		if(rev.contains(s1))
		{
		  System.out.println("Valide Palindrome");
		}
		else
		{
		  System.out.println("No Valid Palindrome");
		}
	 }
}