/*

66. Plus One

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*/
import java.util.*;
class PlusOne
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
		  
	     for(int i=a.length-1;i>=0;i--)
		 {
			  if(a[i]<9)
			  {
				  a[i]++;
			  
			  for(int j=0;j<a.length;j++)
			  {
				  System.out.println(a[j]+" ");
			  }
			  	return;
		     }
			 a[i]=0;
		 }
	
		 
		 int b[]=new int[a.length+1];
		 b[0]=1;
		 System.out.println("Display add +1");
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.println(b[i]);
		 }
		
		 
	 }
	 
}