/*
1464. Maximum Product of Two Elements in an Array

Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0),
 you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
*/
import java.util.*;
class MaximumProduct
{
      public static void main(String args[])
	  {
	       Scanner sc=new Scanner(System.in);
		   int a[]=new int[5];
		   System.out.println("Enter a Array");
		   for(int i=0;i<a.length;i++)
		   {
		      a[i]=sc.nextInt();
		   }
		   
		   Arrays.sort(a);
		   int m1=a[a.length-1];
		   int m2=a[a.length-2];
		   
		   int p=(m1-1)*(m2-1);
		   System.out.println("Maximum Product : "+p);
		   
	  }
}