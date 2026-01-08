/*
58. Length of Last Word

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5
*/

import java.util.*;
class LastWordLengthString
{
     public static  void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Sentence");
		String str=sc.nextLine();
		
		  str=str.trim();
		 String arr[]=str.split(" ");
		 System.out.println(arr[arr.length-1].length());
		
		
	 }
}
/*
   OutPut :

    Enter a Sentence
    hello Onkar How Are you
    3

*/