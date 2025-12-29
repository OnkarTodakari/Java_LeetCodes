/*
217. Contains Duplicate

Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
*/
import java.util.*;
class ContainsDublicate
{
     public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter a array");
		for(int i=0;i<a.length;i++)
		{
		   a[i]=sc.nextInt();
		}
		
		boolean flag=false;
		int  count=1;
		for(int i=0;i<a.length;i++)
		{  
		   for(int j=i+1;j<a.length;j++)
		   {
		   if(a[i]==a[j])
		   {
		       
			   flag=true;
			   break;
		   }
		   }
		   if(flag)
			   break;
		}
		   if(flag)
		   {
		      System.out.println("True");
		   }
		   else
		   {
		      System.out.println("Flase");
		   }
		
	 }
}