/*
2413. Smallest Even Multiple


Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. 
Note that a number is a multiple of itself.
*/
import java.util.*;
class SmallestEvenMultiple
{
      public static void main(String args[])
	  {
	     Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a Number ");
		 int n=sc.nextInt();
		 
		  System.out.println("-----------------------");
		  
                if(n%2==0)
				{
				  System.out.println(n);
				}
				else
				{
		 
		          int r=2*n;
		         System.out.println(r);
	           }
	  }
}