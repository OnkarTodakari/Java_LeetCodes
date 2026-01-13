/*
1051. Height Checker

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
*/
import java.util.*;
class HeightChecker
{
      public static void main(String args[])
	  {
	     Scanner sc=new Scanner(System.in);
		 int a[]=new int[5];
		 System.out.println("Enter a Hight");
		 for(int i=0;i<a.length;i++)
		 {
		    a[i]=sc.nextInt();
		 }
		 
	
		 int b[]= a.clone();
		 Arrays.sort(b);
		 int count=0;
		 for(int i=0;i<a.length;i++)
		 {
		    
			   if(a[i]!=b[i])
			   {
			      count++;
			   
			}
		 }
		 System.out.println(count);

	  }
}