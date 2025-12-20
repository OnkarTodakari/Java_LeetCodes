/*
26. Remove Duplicates from Sorted Array

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
import java.util.*;
class RemoveDublicate
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
		 System.out.println("Without Duplicate elements");
		 for(int i=0;i<a.length;i++)
		 {
		     boolean Duplicate=false;
			for(int j=i+1;j<a.length;j++)
			{
			   if(a[i]==a[j])
			   {
			      Duplicate=true;
				  break;
			   }
			}
			if(!Duplicate)
			{
			    System.out.println(a[i]+" ");
				
			}
		 }
	  }
}