/*
349. Intersection of Two Arrays

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/

import java.util.*;
class IntersectionArray
{
      public static void main(String args[])
	  {
	      Scanner sc=new Scanner(System.in);
		  int a[]=new int[5];
		  int b[]=new int[3];
		  
		  System.out.println("Enter  A Array");
		  for(int i=0;i<a.length;i++)
		  {
		    a[i]=sc.nextInt();
		  }
		  
		  System.out.println("Enter  B Array ");
		  for(int j=0;j<b.length;j++)
		  {
		      b[j]=sc.nextInt();
		  }
		  
		  for(int i=0;i<a.length;i++)
		  {  boolean flag=false;
		     for(int k=0;k<i;k++)
			 {
			    if(a[i]==a[k])
				{
				 
				    flag=true;
				}
			 }
			 if(flag)
			 {
				 continue;
			 } 
				 for(int j=0;j<b.length;j++)
				 {
					 if(a[i]==b[j])
					 {
						  System.out.println(a[i]);
						  break;
					 }
				 }
			 
		  }
	  }
}