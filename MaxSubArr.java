/*
239. Sliding Window Maximum

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
*/
import java.util.*;
class MaxSubArr
{
    public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		System.out.println("Enter a Array");
		for(int i=0;i<a.length;i++)
		{
		   a[i]=sc.nextInt();
		}
		int k=3;
		int max=a[0];
		for(int i=0;i<k;i++)
		{
		     if(a[i]>max)
			 {
			   max=a[i];
			 }
		}
		System.out.println("Max "+max);
		for(int i=k;i<a.length;i++)
		{
		   if(a[i]>max)
		   {
		      max=a[i];
		   }
		   System.out.println("Max "+max);
		}
		
	}
}