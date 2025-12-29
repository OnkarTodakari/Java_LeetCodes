/*
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*/
import java.util.*;
class MerageArray
{
     public static void main(String args[])
	 {
	     Scanner sc=new Scanner(System.in);
		 int a[]=new int[5];
		 int m=3;
		 int b[]=new int[3];
		 int n=3;
		 int c[]=new int[a.length+b.length];
		 int k=0;
		 System.out.println("Enter A Array");
		 for(int i=0;i<a.length;i++)
		 {
		      a[i]=sc.nextInt();
		 }
		 for(int j=0;j<b.length;j++)
		 {
		      b[j]=sc.nextInt();
			  
		 }
		 for(int i=0;i<a.length;i++)
		 {
		    while(m==m)
		    {
		       c[k++]=a[i];
		   }
		 }
		 for(int j=0;j<n;j++)
		 {

			while(b.length>n)
			{
			   c[k++]=b[j];
			}
		 }
		 
		 for(int i=0;i<c.length;i++)
		 {
		    System.out.println(c[i]);
		 }
		 
	 }
}