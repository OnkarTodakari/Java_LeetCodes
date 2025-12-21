/*
283. Move Zeroes

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/
import java.util.*;
class MoveZero
{
      public static void  main(String args[])
	  {
	      Scanner sc=new Scanner(System.in);
		  int a[]=new int[5];
		  System.out.println("Enter a Array");
		  for(int i=0;i<a.length;i++)
		  {
		      a[i]=sc.nextInt();
		  }
		  int k=0;
		  for(int i=0;i<a.length;i++)
		  {
		    
			   if(a[i]!=0)
			   {
			       a[k]=a[i];
				   k++;
			   }
		  }
		   while(k<a.length)
		   {
			   a[k]=0;
			   k++;
		   }
		  System.out.println("Move the Zero Last");
		  for(int i=0;i<a.length;i++)
		  {
			  System.out.println(a[i]);
		  }
		  
	  }
}