/*
1512. Number of Good Pairs

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
*/
import java.util.*;
class GoodPair
{
     public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter a Array");
		for(int i=0;i<a.length;i++)
		{
		   a[i]=sc.nextInt();
		}
		 boolean flag=false;
		 int count=0;
		for(int i=0;i<a.length;i++)
		{
		   for(int j=i+1;j<a.length;j++)
		   {
		      if(a[i]==a[j] && i<j)
			  {
                   
				  System.out.println(i+" "+j);
				  count++;
				   
			  }
			 
		   }
		  
		   
		}
		 System.out.println("Count : "+ count);
	 }
}