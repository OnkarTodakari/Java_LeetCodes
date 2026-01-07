/*
81. Search in Rotated Sorted Array II

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
*/
import java.util.*;
class SearchRotatedArr
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
		
		System.out.println("Enter a Search");
		int skey=sc.nextInt();
		
		boolean found=false;
		
	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==skey)
			{
				found=true;
				break;
			}
		}
		if(found)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	}
	
}