/*
Example 1480:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/
import java.util.*;
class RunningSum
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
		
		int sum=0;
		
		System.out.println("Display the Running Sum");
		for(int i=0;i<a.length;i++)
		{
		   sum=sum+a[i];
		   System.out.println(sum);
		}
	}
}