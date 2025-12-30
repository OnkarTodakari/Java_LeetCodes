/*
268. Missing Number

Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
 2 is the missing number in the range since it does not appear in nums.
*/
import java .util.*;
class MissingArray
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
		 
		 System.out.println("Display missing Element");
		 int count=0;
		 for(int i=a[0];i<a[a.length-1];i++)
		 {
		    if(i!=a[count])
			{
			   System.out.println(i);
			   
			}
			else
			{
			   ++count;
			}
		 }
	 }
}