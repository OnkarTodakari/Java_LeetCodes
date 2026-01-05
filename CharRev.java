/*
344. Reverse String

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/
import java.util.*;
class CharRev
{
    public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   char ch[]=new char[5];
	   System.out.println("Enter a Character");
	   for(int i=0;i<ch.length;i++)
	   {
	      ch[i]=sc.next().charAt(0);
	   }
	   
	   int left=0;
	   int right=ch.length-1;
	   
	   while(left<right)
	   {
	      char temp=ch[left];
		  ch[left]=ch[right];
		  ch[right]=temp;
		  
		  left++;
		  right--;
	   }
	   System.out.println("Display Revarce");
	   for(int i=0;i<ch.length;i++)
	   {
	      System.out.print(ch[i]);
	   }
	}
}