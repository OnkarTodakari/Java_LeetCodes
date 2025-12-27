/*
704. Binary Search

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
*/
import java.util.*;
class BinarySearch
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
		
		System.out.println("Enter a One element");
		int skey=sc.nextInt();
		
		int right=(a.length-1);
		int left=0;
		index=-1;
		
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(a[mid]==skey)
			{
				index=mid;
				break;
			}
			if(mid<skey)
			{
				left=left+1;
			}
			else
			{
				right=right-1;
			}
		}
		if(index!=-1)
		{
			System.out.println("Data Found");
		}
		else{
			System.out.println("Not Found");
		}
		 
	 }
}