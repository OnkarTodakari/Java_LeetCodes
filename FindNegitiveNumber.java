/*
1351. Count Negative Numbers in a Sorted Matrix

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
*/
import java.util.*;
class FindNegitiveNumber
{
    public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   int a[][]=new int[3][3];
	   System.out.println("Enter a array");
	   for(int i=0;i<a.length;i++)
	   {
	      for(int j=0;j<a.length;j++)
		  {
		     a[i][j]=sc.nextInt();
		  }
	   }
	     int count=0;
		for(int i=0;i<a.length;i++)
		{
		   for(int j=0;j<a[i].length;j++)
		   {
		      if(a[i][j]<0)
			  {
			      count++;
			  }
		   }
		}
		System.out.println(count);
	}
}